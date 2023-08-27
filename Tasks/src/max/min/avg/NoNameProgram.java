package max.min.avg;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class NoNameProgram {
    public void main(String[] args) {
        CountDownPriorityBarrier ap = new CountDownPriorityBarrier();

    }
    public class CountDownPriorityBarrier {
        private final NavigableSet<Node> eventDeque;
        private int max, count, countUnparked;
        private final Lock lock;
        private final Condition condition;

        private record Node(int val, Thread th) implements Comparable<Node> {
            @Override
            public int compareTo(Node o) {
                return Integer.compare(val, o.val);
            }
        }

        public CountDownPriorityBarrier() {
            eventDeque = new TreeSet<>();
            count = max = countUnparked = 0;
            lock = new ReentrantLock();
            condition = lock.newCondition();
        }

        /**
         * Blocks the thread for count ticks, which can be reduced using the {@link CountDownPriorityBarrier#countDown()} method.
         */
        public void await(final int count) throws InterruptedException {
            await(0, null, null);
        }

        /**
         * Blocks the thread for count ticks, which can be reduced using the {@link CountDownPriorityBarrier#countDown()} method.
         *
         * @param parallelWaitingAction is guaranteed to happen before by calling the {@link CountDownPriorityBarrier#countDown()} method, after which an unparking thread must occur.
         * @param barrierAction         the same guarantees as parallelWaitingAction, and it is also guaranteed that the call will occur after the call to the {@link CountDownPriorityBarrier#countDown()} method, which initiates the unpacking of the thread.
         */
        public void await(final int count, final Runnable parallelWaitingAction, final Runnable barrierAction) throws InterruptedException {
            lock.lock();
            try {
                if (count > 0) {
                    eventDeque.add(new Node(max - this.count + count, Thread.currentThread()));
                    int globalMax = eventDeque.last().val();
                    if (globalMax != max) {
                        this.count = globalMax - max + this.count;
                        this.max = globalMax;
                    }
                    lock.unlock();
                    if (parallelWaitingAction != null) parallelWaitingAction.run();
                    lock.lock();
                    while (max - this.count < count) {
                        lock.unlock();
                        LockSupport.park(lock);
                        if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
                        lock.lock();
                    }
                    lock.unlock();
                } else {
                    countUnparked++;
                    lock.unlock();
                    if (parallelWaitingAction != null) parallelWaitingAction.run();
                }
                if (barrierAction != null) barrierAction.run();
                lock.lock();
                countUnparked--;
                if (countUnparked == 0) condition.signal();
            } finally {
                lock.unlock();
            }
        }

        public void countDown() throws InterruptedException {
            lock.lock();
            try {
                while (countUnparked > 0) condition.await();
                --count;
                Node min;
                while (!eventDeque.isEmpty() &&
                        max - this.count >= (min = eventDeque.first()).val) {
                    eventDeque.remove(min);
                    ++countUnparked;
                    LockSupport.unpark(min.th);
                }
                if (eventDeque.isEmpty()) {
                    count = 0;
                } else {
                    int globalMax = eventDeque.last().val();
                    if (globalMax != max) {
                        this.count = globalMax - max + this.count;
                        this.max = globalMax;
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
    }


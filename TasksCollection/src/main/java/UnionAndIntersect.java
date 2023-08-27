import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionResult = new HashSet<>(set1);
        unionResult.addAll(set2);

        System.out.println("Union result: " + unionResult);


        Set<Integer> intersectResult = new HashSet<>(set1);
        intersectResult.retainAll(set2);

        System.out.println("intersectResult: " + intersectResult);
    }
}

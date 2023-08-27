package HeavyBoxes;

public class HeavyBox implements Comparable<HeavyBox> {

    private int number;
    private int age;
    private int longer;


    public HeavyBox(int number, int age, int longer) {
        this.number = number;
        this.age = age;
        this.longer = longer;
    }

    // public static void add(HeavyBoxes.HeavyBox heavyBox) {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLonger() {
        return longer;
    }

    public void setLonger(int longer) {
        this.longer = longer;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.age - o.age;
    }
}

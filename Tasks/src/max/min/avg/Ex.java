package max.min.avg;

public class Ex {
    public static void main(String[] args) {
        int b = 5;
        int a = 12;
        int c = ++a - b++;
        System.out.println(c);
        int d = b++ * 2;
        System.out.println(d);
        System.out.println(b);
    }
}

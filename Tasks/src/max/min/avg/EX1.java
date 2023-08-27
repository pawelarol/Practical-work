package max.min.avg;

public class EX1 {

    public static void main(String[] args) {
        callMetods();
    }

    public static void callMetods() {
        int n = 100;
        double[] massiv1 = new double[n];
        for (int i = 0; i < massiv1.length; i++) {
            massiv1[i] = Math.random();
        }

        double max = massiv1[0];
        double min = massiv1[0];
        double avg = 0;
        for (int i = 0; i < massiv1.length; i++) {
            if (max < massiv1[i])
                max = massiv1[i];
            if (min > massiv1[i])
                min = massiv1[i];
            avg += massiv1[i] / massiv1.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}

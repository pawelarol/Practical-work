import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
            String input = scanner.next();
            if (input.equals("0")) {
                processZero();
            } else if (isInteger(input)) {
                int Number = Integer.parseInt(input);
                proccessInt(Number);
            } else if (isDouble(input)) {
                double dnumber = Double.parseDouble(input);
                proccessDouble(dnumber);
            } else {
                processString(input);
            }
        }
    }

    private static void proccessDouble(double dnumber) {
        if (dnumber > 0.0) {
            System.out.println("You picked a positive dnumber");
        } else if (dnumber < 0.0) {
            System.out.println("You picked a negative dnumber");
        }
    }


    static void proccessInt(int number) {

        if (number > 0) {
            System.out.println("You picked a positive number");
        } else if (number < 0) {
            System.out.println("You picked a negative number");
        }
    }


    static void processZero() {
        System.out.println("You picked zero");
    }

    static void processString(String value){
        System.out.println("You enter String:" + value);
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}




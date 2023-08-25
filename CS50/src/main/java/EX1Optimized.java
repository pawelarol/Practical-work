import java.util.Scanner;

public class EX1Optimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for( int i = 0; i< 10; i++){
            System.out.println("Enter your number: ");
            String input = scanner.nextLine();
            processImput(input);
        }
    }

    private static void processImput(String input){
        try{
            double number = Double.parseDouble(input);
            processNumber(number);
        } catch(NumberFormatException e){
            processString(input);
        }
    }

    private static void processString(String input) {
        System.out.println("You entered String: " + input);
    }

    private static void processNumber(double number) {

        if(number>0.0){
            System.out.println("You picked a positive number");
        } else if(number <0.0){
            System.out.println("You picked a negative number");
        } else{
            System.out.println("You picked zero");
        }
    }
}

import java.util.Scanner;

public class EX1Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         for(int i = 0; i<10; i++){
             System.out.println("Enter you number:");
             String input = scanner.next();
             
             switch(getType(input)){
                 case INTEGER:
                     int number = Integer.parseInt(input);
                     proccessInt(number);
                     break;
                 case DOUBLE:
                     double dnumber = Double.parseDouble(input);
                     proccessDouble(dnumber);
                     break;
                 case ZERO:
                     processZero();
                     break;
                 default:processString(input);
                 break;
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
        } else {
            System.out.println("You picked zero");
        }
    }


    static void processZero() {
        System.out.println("You picked zero");
    }

    static void processString(String value){
        System.out.println("You enter String:" + value);
    }

    private enum inputType{
        INTEGER, DOUBLE, ZERO, STRING
    }
    
    private static inputType getType(String input){
        if(input.equals(0)){
            return inputType.ZERO;
        } else if (isNumeric(input)) {
            return input.contains(".") ? inputType.DOUBLE : inputType.INTEGER;
        }else {
            return inputType.STRING;
        }
    }

    private static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}






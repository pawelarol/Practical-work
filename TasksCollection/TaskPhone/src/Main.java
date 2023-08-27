public class Main {

    public static void main(String[] args) {
        Phone p1 = new Phone(1231,"Nokia", 120);
        Phone p2 = new Phone(122, "Samsung", 100);
        Phone p3 = new Phone(1442, "Iphone", 110);

        System.out.println("First phone:");
        System.out.println("Model" + " " +  p1.getModel());
        System.out.println("Weight" + " " + p1.getWeight());
        System.out.println("Number" + " " + p1.getNumber());

        System.out.println("Second phone:");
        System.out.println("Model" + " " +  p2.getModel());
        System.out.println("Weight" + " " + p2.getWeight());
        System.out.println("Number" + " " + p2.getNumber());

        System.out.println("Third phone:");
        System.out.println("Model" + " " +  p3.getModel());
        System.out.println("Weight" + " " + p3.getWeight());
        System.out.println("Number" + " " + p3.getNumber());

        p1.receiveCall("Andrey");
        p1.getNumber("48796953070");

        p2.receiveCall("Tommy");
        p2.getNumber("375333104229");

        p3.receiveCall("Pavel");
        p3.getNumber("375336861377");

        p1.receiveCall("48796953070","Andrey");

        p1.sendMessage("375333104229","48796953070","375336861377");
    }
}

package FactoryMethod;

public class SeaLogistics{
    public static Ship createTransport(){
        String name  = "Pawel";
        String company  = "EAGLEs";
        int weight = 21;
        Ship ship = new Ship(name,weight,company);
        System.out.println("the goods will be delivered by sea");
        return ship;

    }
}

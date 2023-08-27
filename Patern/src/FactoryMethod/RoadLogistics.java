package FactoryMethod;


public class RoadLogistics {
    public static Truck createTransport(){
        String name  = "Pawel";
        String company  = "EAGLEs";
        int weight = 2122;
        Truck truck = new Truck(name, company, weight);
        System.out.println("the goods will be delivered by road");
        return truck;
    }
}

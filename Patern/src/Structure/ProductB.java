package Structure;

public class ProductB implements Product {
    String name = "cup";
    String material = "Metal";
    String size = "small";
    String color = "black";

    public void showList(){
        System.out.println(name);
        System.out.println(material);
        System.out.println(size);
        System.out.println(color);
    }
}

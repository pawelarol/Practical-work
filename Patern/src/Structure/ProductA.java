package Structure;

public class ProductA implements Product {
    String name = "lime";
    String material = "Organica";
    String color = "Yellow";
    String taste = "sour";

    @Override
    public void showList() {
        System.out.println(name);
        System.out.println(material);
        System.out.println(color);
        System.out.println(taste);
    }
}

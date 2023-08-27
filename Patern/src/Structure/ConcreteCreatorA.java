package Structure;

public class ConcreteCreatorA extends Creator{
   public  Product createProduct(){
        return new ProductA();
    }
}

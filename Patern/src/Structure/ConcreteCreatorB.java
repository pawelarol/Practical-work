package Structure;

public class ConcreteCreatorB extends Creator{

    public Product createProduct(){
        return new ProductB();
    }
}

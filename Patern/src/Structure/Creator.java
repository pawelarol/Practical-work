package Structure;



abstract class Creator {

    public abstract Product createProduct();

    public void doSomething(){
        Product product = createProduct();
        product.showList();
    }

    public static void main(String[] args) {
            Creator creator1 = new ConcreteCreatorA();
            creator1.doSomething();

            Creator creator2 = new ConcreteCreatorB();
            creator2.doSomething();
    }
}

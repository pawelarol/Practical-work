public class Phone {
    protected int number;
    protected String model;
    protected int weight;


    protected void sendMessage(String... number){
        System.out.println("Sending message to the following phone numbers:");
        for(String phoneNumber : number){
            System.out.println(phoneNumber);
        }
    }

    protected void receiveCall(String name){
        System.out.println( name  + " is calling");
    }

    protected String receiveCall(String number, String name){
        System.out.println(number + name + " is calling ");
        return number + name;
    }

    protected String  getNumber(String number){
        return number;
    }


    public Phone(String model, int number){
        this.model = model;
        this.number = number;
    }

    public Phone (){

    }
    public Phone(int number, String model, int weight) {
        this(model, number);
       this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

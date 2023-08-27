package FactoryMethod;

public class Truck {
    String name;
    String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;

    public Truck(String name, String company, int weight) {
        this.name = name;
        this.company = company;
        this.weight = weight;
    }
}

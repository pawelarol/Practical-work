package FactoryMethod;

public class Ship {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    int weight;

    public Ship(String name, int weight, String company) {
        this.name = name;
        this.weight = weight;
        this.company = company;
    }

    String company;
}

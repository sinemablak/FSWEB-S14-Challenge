package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    @Override
    public double itemizeHamburger() {
        System.out.println("Base price of " + getName() + " is " + getPrice());

        if (this.healthyExtra1Name != null) {

            setPrice(this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {

            setPrice(this.healthyExtra2Price);
        }

        return getPrice();
    }
}

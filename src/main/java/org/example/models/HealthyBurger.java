package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
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
        double totalPrice = super.itemizeHamburger();  // hamburger ve normal addition’ları hesapla

        if (this.healthyExtra1Name != null) {
            System.out.println("Added healthy addition: " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
            totalPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Name != null) {
            System.out.println("Added healthy addition: " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
            totalPrice += this.healthyExtra2Price;
        }

        System.out.println("Total Healthy Burger price is " + totalPrice);
        return totalPrice;
    }
}

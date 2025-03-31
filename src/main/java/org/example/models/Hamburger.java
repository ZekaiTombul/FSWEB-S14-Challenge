package org.example.models;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double price){
        this.addition1Name = addition1Name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String addition2Name, double price){
        this.addition2Name = addition2Name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String addition3Name, double price){
        this.addition3Name = addition3Name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String addition4Name, double price){
        this.addition4Name = addition4Name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.addition1Name != null) {
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            totalPrice += this.addition1Price;
        }

        if (this.addition2Name != null) {
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            totalPrice += this.addition2Price;
        }

        if (this.addition3Name != null) {
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            totalPrice += this.addition3Price;
        }

        if (this.addition4Name != null) {
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            totalPrice += this.addition4Price;
        }

        System.out.println("Total Burger price is " + totalPrice);
        return totalPrice;

    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}

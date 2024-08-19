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

    public Hamburger(String name,String meat,double price,String breadRollType){
        this.name=name;
        this.meat=meat;
        this.price=price;
        this.breadRollType=breadRollType;
    }
    public String getName(){
        return name;
    }
    public String getMeat(){
        return meat;
    }
    public double getPrice() {
        return price;
    }
    public String getBreadRollType(){
        return breadRollType;
    }
    public void setPrice(double price) {
        this.price += price;
    }
    public void addHamburgerAddition1(String name,double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String name,double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }
    public double itemizeHamburger(){

        System.out.println("Base price of " + this.name + " is " + this.price);

        if(this.addition1Name != null) {
            this.price += this.addition1Price;
            System.out.println(this.addition1Name + this.addition1Price);
        }

        if(this.addition2Name != null) {
            this.price += this.addition2Price;
            System.out.println(this.addition2Name + this.addition2Price);
        }

        if(this.addition3Name != null) {
            this.price += this.addition3Price;
            System.out.println(this.addition3Name + this.addition3Price);
        }

        if(this.addition4Name != null) {
            this.price += this.addition4Price;
            System.out.println(this.addition4Name + this.addition4Price);
        }

        return this.price;
    }
}

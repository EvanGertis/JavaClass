package com.gertis;

public class BaseBurger {
    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, ect) that
    // the customer can select to be added to the burger.
    // Each one of these items gets charged an additional prices so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).
    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price, can also include name burger or you can use
    // a setter

    private String name;
    private String rollType;
    private String meatType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public BaseBurger(String name, String rollType, String meatType, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hambugerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.rollType + " roll " + " price is " + this.price);

        if(this.addition1Name != null)
        {
            hambugerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if(this.addition2Name != null)
        {
            hambugerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if(this.addition3Name != null)
        {
            hambugerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if(this.addition4Name != null)
        {
            hambugerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return  hambugerPrice;
    }
}

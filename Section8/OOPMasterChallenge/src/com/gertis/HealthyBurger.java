package com.gertis;

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The health burger can have 6 items (Additions) in total.
// hint: you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

public class HealthyBurger extends BaseBurger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meatType, double price) {
        super("Healthy", "Brown rye", meatType, price);
    }

    public void addHealthyAddition1(String name, double price)
    {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition12(String name, double price)
    {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    @Override
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null)
        {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added" + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null)
        {
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added" + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        return hamburgerPrice;
    }
}

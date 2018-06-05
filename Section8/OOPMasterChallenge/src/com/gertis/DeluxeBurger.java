package com.gertis;

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint: You have to find a way to automatically add the new additions at the time the deluxe burger object is created, and then prevent
// other additions from being made.

public class DeluxeBurger extends BaseBurger {
    public DeluxeBurger() {
        super("Deluxe", "White","Sausage & Bacon", 10.00);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add");
    }


}

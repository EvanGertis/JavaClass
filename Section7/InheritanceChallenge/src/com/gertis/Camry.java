package com.gertis;

public class Camry extends Car {

    public String color;
    public double price;

    public Camry(boolean changingGears, boolean increaingSpeed, boolean decreasingSpeed, boolean turningLeft, boolean turningRight, int year, double fuelRating, String color, double price) {
        super(changingGears, increaingSpeed, decreasingSpeed, turningLeft, turningRight, year, fuelRating);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

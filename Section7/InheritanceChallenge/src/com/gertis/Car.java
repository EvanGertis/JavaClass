package com.gertis;

public class Car extends Vehicle {

    public int year;
    public double FuelRating;

    public Car(boolean changingGears, boolean increaingSpeed, boolean decreasingSpeed, boolean turningLeft, boolean turningRight, int year, double fuelRating) {
        super(changingGears, increaingSpeed, decreasingSpeed, turningLeft, turningRight);
        this.year = year;
        FuelRating = fuelRating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelRating() {
        return FuelRating;
    }

    public void setFuelRating(double fuelRating) {
        FuelRating = fuelRating;
    }
}

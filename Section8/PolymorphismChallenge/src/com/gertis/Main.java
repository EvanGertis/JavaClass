package com.gertis;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name, boolean engine ) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void StartEngine()
    {
        System.out.println( name + " has been engaged");
        engine = true;
    }

    public void TurnOffEngine()
    {
        System.out.println(name + " has been turned off");
        engine = false;
    }

    public void accelerate()
    {
        System.out.println(name + " is accelerating");
    }

    public void brake()
    {
        System.out.println(name + " is braking");
    }
}



class Honda extends Car{

    public Honda()
    {
        super(8, "Accord", false);
    }

}

class Jeep extends Car{

    public Jeep()
    {
        super(8, "Cheerokee", false);
    }

}

public class Main {

    public static void main(String[] args) {
	// We are going to go back to the car analogy
        // Create a base class called Car
        // I should have a few fields that would be appropriate for generic car class.
        // engine, cylinders, wheels, ect.
        // Constructor should intialze cylinders (number of) and name, and set wheels to 4
        // and enginge to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Jeep();

        System.out.println(car.getName());
        System.out.println(car.getCylinders());

        car.StartEngine();

        Toyota toyota = new Toyota( 6 , "Carolla");

        System.out.println(toyota.getName());
        System.out.println(toyota.getCylinders());

        toyota.StartEngine();

    }


}

package com.gertis;

public class Main {

    public static void main(String[] args) {
	    // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
	    // width of float = 32 (3 bytes)
        float myFloatValue = 5.0f / 2f;
        // width of double = 64 (8 bytes)
	    double myDoubleValue = 5.0d / 2d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Convert a given number of pounds to kilograms
        //1. Create a variable to store the number of pounds
        //2. Calculate the number of Kilograms for the number above and store it in a variable
        //3. Print out the result.
        //
        //Notes: 1 pound is equal to 0.4539237 kilograms.

        double numPounds = 12;
        double numKilos = numPounds/0.4539237;
        System.out.println(numPounds + " lbs is : " + numKilos + " kg");
    }
}

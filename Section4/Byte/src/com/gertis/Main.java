package com.gertis;

public class Main {

    public static void main(String[] args) {
    // Create a byte variable and set it to any valid byte number
        byte numByte = 10;
    // Create a short variable and set it to any valid short number
        short numShort = 1801;
    // Create a int variable and set it to any valid int number
        int numInt = -1;
    // Create a long variable and set it to any valid long number
        long numLong= 0L;

        numLong = (long)(5000+ 10*(numByte+ numShort+ numInt));
        System.out.println(numLong);




    }
}

package com.evangertis;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Evan";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("2nd intialization");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}

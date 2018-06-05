package com.gertis;

public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9';
        System.out.println("Unicode output was : " + myChar);

        boolean myBoolean = true;

        //1. Find the code for the registered symbol on the same line as the copyright symbol.
        //2. Create a variable of type char and assign it the unicode value for that symbol.
        //3. Display in on screen.

        char myRegistered = '\u00AE';
        System.out.println("Registered symbol : "+ myRegistered);

    }
}

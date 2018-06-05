package com.evangertis;

import java.util.Scanner;

public class X {

    private int x = 0;

    public X() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void showInput()
    {
        System.out.println("The input was " + this.x);
    }

    public void setInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        setX(scanner.nextInt());
    }
}

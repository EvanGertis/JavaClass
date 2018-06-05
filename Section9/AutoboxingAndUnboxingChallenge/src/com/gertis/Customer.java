package com.gertis;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name)
    {
        this.name = name;
    }
}

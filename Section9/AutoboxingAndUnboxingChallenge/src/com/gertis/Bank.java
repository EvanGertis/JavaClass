package com.gertis;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(Branch branch, Customer customer, double initialTransaction)
    {
        customer.transactions.add(initialTransaction);
        branch.customers.add(customer);
        this.branches.add(branch);
    }


}

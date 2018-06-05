package com.gertis;

public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer classs should have an arraylist of Doubles (transactions)
        // Customer:
        // Name and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing your code
        // Hint: transactions
        // Add data validation
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions.

        Bank evansBank = new Bank("EvansBank");

        evansBank.addBranch("Buffalo");

        evansBank.addCustomer("Buffalo", "Evan Gertis", 1000);
        evansBank.addCustomer("Buffalo","Warren Buffet",10000);


        evansBank.addBranch("Rochester");

        evansBank.addCustomer("Rochester", "Elon Musk", 1000);

        evansBank.addCustomerTransaction("Buffalo","Evan Gertis", 33);

        evansBank.ListCustomers("Buffalo", true);
    }
}

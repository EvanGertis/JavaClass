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

        Bank bank = new Bank();

        Branch branch0 = new Branch();

        Customer customer0 = new Customer("New customer0");

        double initialTransaction = 10.7;

        bank.addBranch(branch0, customer0, initialTransaction);

        branch0.addAdditionalTransaction(customer0, 50.0);

        Customer customer1 = new Customer("New customer1");

        branch0.addNewCustomers(customer1, 0.7);
        branch0.addAdditionalTransaction(customer1, 54.);

        branch0.printCustomers();



    }
}

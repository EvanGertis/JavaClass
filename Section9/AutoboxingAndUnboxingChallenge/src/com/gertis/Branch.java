package com.gertis;

import java.util.ArrayList;

public class Branch {
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addNewCustomers(Customer customer, double initialTransactionAmount)
    {
        customer.transactions.add(initialTransactionAmount);
        this.customers.add(customer);
    }

    public void addAdditionalTransaction(Customer customer, double addtionalTransaction)
    {
        Customer currentCustomer = this.customers.get(this.customers.indexOf(customer));
        currentCustomer.transactions.add(addtionalTransaction);
    }

    public void printCustomers()
    {
        for(int i = 0; i < customers.size(); i++)
        {
            System.out.println("Customer[" + i + "] : " + customers.get(i).name);

            for (int j = 0; j < customers.get(i).transactions.size(); j++)
            {
                System.out.println("Transaction : " + customers.get(i).transactions.get(j));
            }
        }
    }
}

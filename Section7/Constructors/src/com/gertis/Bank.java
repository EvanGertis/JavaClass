package com.gertis;

public class Bank {

    private int accountNumber = 0;
    private double balance = 0;
    private String CustomerName = "";
    private String Email = "";
    private int phoneNumber = 0;

    //Default constructor
    public Bank()
    {
        this.accountNumber = 0;
        this.balance = 0;
        this.CustomerName = "blank";
        this.Email = "blank";
        this.phoneNumber = 0;
    }

    public Bank(String customerName, String email, int phoneNumber) {
        this(9999,100.55, customerName, email, phoneNumber);
    }

    public Bank(int accountNumber, double balance, String CustomerName, String email, int phoneNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.CustomerName = CustomerName;
        this.Email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void customerDeposit(double deposit)
    {
        this.balance += deposit;
    }

    public void customerWithdrawl(double withdrawl)
    {
        if( withdrawl > this.balance)
        {
            System.out.println("Withdrawl is greater than balance");
        }
        else
        {
            this.balance -= withdrawl;
        }
    }
}

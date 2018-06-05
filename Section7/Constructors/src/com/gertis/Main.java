package com.gertis;

public class Main {

    public static void main(String[] args) {
	// create a new class for a bank account
        // create fields for the account number, balance, customer name, email and phone number.
        //
        // create getters and setters for each field
        // create two additional mathods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the main class to
        // confirm your code is workings.
        // Add some System.out.println's in the two methods above as well.

        Bank EvansBank = new Bank(555342, 1000, "Evan Gertis", "Evan@aol.com", 55512345);

        System.out.println("Acc #: " + EvansBank.getAccountNumber());
        System.out.println("Balance : " + EvansBank.getBalance());
        System.out.println("Customer name : " + EvansBank.getCustomerName());
        System.out.println("Customer email: " + EvansBank.getEmail());
        System.out.println("Customer phone: " + EvansBank.getPhoneNumber());

        EvansBank.customerDeposit(500);
        System.out.println("Balance after deposit : " + EvansBank.getBalance());
        EvansBank.customerWithdrawl(1400);
        System.out.println("Balance after 1400 withdrawl : " + EvansBank.getBalance());
        System.out.println("Attempt to Withdrawl another $200 ");
        EvansBank.customerWithdrawl(500);

        Bank bankOfAmerica = new Bank("George", "George@aol.com", 555123456);
        System.out.println(bankOfAmerica.getAccountNumber());
        System.out.println(bankOfAmerica.getEmail());
        System.out.println(bankOfAmerica.getPhoneNumber());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());

        VipCustomer person2 = new VipCustomer("Jack", 1.0);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Dave", 2.0, "Dave@aol.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());

    }
}

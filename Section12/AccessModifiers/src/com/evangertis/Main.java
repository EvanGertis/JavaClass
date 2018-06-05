package com.evangertis;

public class Main {

    public static void main(String[] args) {
	    Account evansAccount = new Account("Tim");
	    evansAccount.deposit(1000);
	    evansAccount.withdraw(500);
	    evansAccount.withdraw(-200);
	    evansAccount.deposit(-20);
	    evansAccount.calculateBalance();

		System.out.println("Balance on Account is " + evansAccount.getBalance());
		evansAccount.calculateBalance();
    }
}

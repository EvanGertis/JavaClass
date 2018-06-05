package com.gertis;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
	// Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options: Quit, print list of contacts, add new contact, update exisiting contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. not its, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        int choice = 0;

        while(!quit)
        {
            phone.Options();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    phone.ViewContacts();
                    break;
                case 2:
                    phone.AddNewContact();
                    break;
                case 3:
                    phone.UpdateContact();
                    break;
                case 4:
                    phone.RemoveContact();
                    break;
                case 5:
                    phone.FindContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
            System.out.println("");

        }

    }
}

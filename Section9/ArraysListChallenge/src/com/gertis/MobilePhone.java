package com.gertis;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends Contacts {

    private static Scanner scanner = new Scanner(System.in);

    public void Options()
    {
        System.out.println("Options Menu, please select and option: ");
        System.out.println("1 - View Contacts");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Update an existing contact");
        System.out.println("4 - Remove an existing contact");
        System.out.println("5 - Find a contact");
        System.out.println("6 - Quit");
    }

    public void Quit()
    {

    }

    public void ViewContacts()
    {
        PrintContacts();

    }

    public void AddNewContact()
    {
        System.out.println("Please enter the name of the contact that you would like to add: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the number '###-###-#####' of the contact that you would like to add: ");
        String number = scanner.nextLine();

        NewContact(name, number);

    }

    public void UpdateContact()
    {
        System.out.println("Please enter the name of the contact that you wish to modify");
        String oldName = scanner.nextLine();

        System.out.println("Please enter the new name for the contact that you wish to modify");
        String newName = scanner.nextLine();

        System.out.println("Please enter the new number for the contact that you wish to modify");
        String newNumber = scanner.nextLine();

        ModifyContact(oldName, newName, newNumber);

    }

    public void RemoveContact()
    {
        System.out.println("Please enter the name of the contact that you would like to remove");
        String nameToRemove = scanner.nextLine();
        Remove(nameToRemove);

    }

    public void FindContact()
    {
        System.out.println("Please enter the name of the contact that you want to find");
        String nameToFind = scanner.nextLine();
        String phoneNumber = Find(nameToFind);
        System.out.println("Name: " + nameToFind + " Phone: " + phoneNumber);

    }
}

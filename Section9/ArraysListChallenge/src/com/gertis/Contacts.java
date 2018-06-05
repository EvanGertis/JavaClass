package com.gertis;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> phoneNumber = new ArrayList<String>();

    public void NewContact(String contactName, String contacNumber)
    {
        if(name.contains(contactName))
        {
            System.out.println(contactName + " already exists");
            return;
        }
        name.add(contactName);
        phoneNumber.add(contacNumber);
    }

    public void PrintContacts()
    {
        System.out.println("Contact List");
        for(int i = 0; i < name.size(); i++)
        {
            System.out.println("Name: " + name.get(i) + " Phone: " + phoneNumber.get(i));
        }
    }

    public void ModifyContact(String contactName, String newName, String newNumber)
    {
        if(name.contains(newName))
        {
            System.out.println(newName + " already exists");
            return;
        }
        int index = name.indexOf(contactName);
        name.set(index, newName);
        phoneNumber.set(index, newNumber);
    }

    public void Remove(String contactName)
    {
        int index = name.indexOf(contactName);
        name.remove(contactName);
        phoneNumber.remove(index);
    }

    public String Find(String contactName)
    {
        int index = name.indexOf(contactName);
        return phoneNumber.get(index);
    }




}

package com.gertis;

public class Bedroom {
    public boolean door;

    public void setDoor(boolean door) {
        this.door = door;
    }

    public Bedroom(boolean door) {
        this.door = door;
    }

    public void openDoor(boolean open)
    {
        if(open)
        {
            System.out.println("You have opened the bedroom door");
        }
        if(!open)
        {
            System.out.println("Bedroom door is closed");
        }
    }

    public void viewFurniture()
    {
        System.out.println("There is a bed and a mirror");
    }
}

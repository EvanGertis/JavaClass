package com.gertis;

public class House {

    public String color;
    public boolean door;
    public int windows;

    private int floor;
    private int roomNum;

    private Bedroom bedroom;

    public void setDoor(boolean door) {
        this.door = door;
    }

    public House(String color, boolean door, int windows, int floor, int roomNum, Bedroom bedroom) {
        this.color = color;
        this.door = door;
        this.windows = windows;
        this.floor = floor;
        this.roomNum = roomNum;
        this.bedroom = bedroom;
    }

    public void goToRoom(int roomNumber)
    {
        System.out.println("You are entering room" + roomNumber);
        this.roomNum = roomNumber;
    }

    public void goToFloor(int floor)
    {
        System.out.println("You have arrived at floor" + floor);
        this.floor = floor;
    }

    public void openDoor(boolean open)
    {
        if(open)
        {
            System.out.println("You have opened the house door");
        }
        if(!open)
        {
            System.out.println("House door closed");
        }
    }

    public void enterHouse()
    {
        if(this.door)
        {
            goToFloor(this.floor);
            goToRoom(this.roomNum);
            if(this.roomNum == 4)
            {
                if(bedroom.door)
                {
                    bedroom.openDoor(bedroom.door);
                    bedroom.viewFurniture();
                }
                else
                {
                    System.out.println("Room is occupied");
                }
            }
            else
            {
                System.out.println("You only have access to Bedroom");
            }
        }
        else
        {
            openDoor(this.door);
        }


    }
}

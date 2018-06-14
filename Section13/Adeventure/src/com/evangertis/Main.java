package com.evangertis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(1, "You are sitting infront of a computer learning java"));
        locations.put(1, new Location(2, "You are standing at the end of a road before a small building"));
        locations.put(2, new Location(3, "You are in the desert"));
        locations.put(3, new Location(4, "You are in the jungle"));
        locations.put(4, new Location(5, "You are in a valley beside a stream"));
        locations.put(5, new Location(6, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N",5);


        locations.get(3).addExit("W",1);


        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);


        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W", 2);


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println("");

            String direction = userInput(scanner.nextLine());
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            else
            {
                System.out.println("You cannot go in that direction");
            }
        }

    }

    public static String userInput(String input){
        String[] strArr = input.toLowerCase().split(" ");
        String output = " ";

        for(String i : strArr)
        {
            switch (i){
                case "east":
                    output = "E";
                    break;
                case "west":
                    output = "W";
                    break;
                case "north":
                    output = "N";
                    break;
                case "south":
                    output = "S";
                    break;
                case "quit":
                    output = "Q";
                default:
                    break;
            }
        }

        return output;
    }
}

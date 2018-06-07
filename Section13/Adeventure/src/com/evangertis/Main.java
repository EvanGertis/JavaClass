package com.evangertis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting infront of a computer learning java"));
        locations.put(1, new Location(0, "You are standing at the end of a road before a small building"));
        locations.put(2, new Location(0, "You are sitting infront of a computer learning java"));
        locations.put(3, new Location(0, "You are sitting infront of a computer learning java"));

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You cannot go in that direction");
            }
        }

    }
}

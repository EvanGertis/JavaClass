package com.evangertis;

import  java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String decription;
    private final Map<String, Integer> exits;

    public Location(int locationID, String decription, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.decription = decription;
        if(exits != null)
        {
            this.exits = new HashMap<String, Integer>(exits);
        }
        else
        {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return decription;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}

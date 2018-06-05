package com.gertis;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team)
    {
        if(teams.contains(team))
        {
            System.out.println(team.getName() + " is already in the league");
            return false;
        }
        else
        {
            teams.add(team);
            System.out.println(team.getName() + " added to " + this.name);
            return true;
        }
    }

    public void showTeams()
    {
        Collections.sort(teams);
        for( T team : teams)
        {
            System.out.println(team.getName());
        }
    }

}

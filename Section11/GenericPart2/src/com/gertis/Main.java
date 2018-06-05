package com.gertis;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> buffaloBills = new Team<>("Buffalo Bills");
        buffaloBills.addPlayer(joe);
//        buffaloCrows.addPlayer(pat);
//        buffaloCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Buffalo Bisons");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Buffalo Stars");
        soccerTeam.addPlayer(beckham);

        System.out.println(buffaloBills.numPlayers());

        Team<FootballPlayer> miamiDolphins = new Team<>("Miami Dolphins");
        FootballPlayer marino = new FootballPlayer("Marino");
        miamiDolphins.addPlayer(marino);

        Team<FootballPlayer> pittsburghSteelers = new Team<>("Pittsburgh Steelers");
        Team<FootballPlayer> greenbayPackers = new Team<>("GreenBay Packers");

        pittsburghSteelers.matchResult(greenbayPackers, 1, 0);
        pittsburghSteelers.matchResult(buffaloBills, 3, 8);

        buffaloBills.matchResult(pittsburghSteelers, 2, 1);
        buffaloBills.matchResult(greenbayPackers, 2, 4);

        System.out.println("Rankings");
        System.out.println(buffaloBills.getName() + " : " + buffaloBills.ranking());
        System.out.println(pittsburghSteelers.getName() + " : " + pittsburghSteelers.ranking());
        System.out.println(miamiDolphins.getName() + " : " + miamiDolphins.ranking());

        System.out.println(buffaloBills.compareTo(miamiDolphins));
        System.out.println(miamiDolphins.compareTo(buffaloBills));



    }
}

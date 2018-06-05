package com.gertis;

public class Main {

    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.
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

        League<Team<FootballPlayer>> footBallLeague = new League<>("Football League");
        footBallLeague.addTeam(buffaloBills);
        footBallLeague.addTeam(miamiDolphins);
        footBallLeague.addTeam(pittsburghSteelers);
        footBallLeague.addTeam(greenbayPackers);

        footBallLeague.showTeams();
    }
}

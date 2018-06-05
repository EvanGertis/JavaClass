package com.gertis;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String playerName = "Evan";

	    int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " +highScore);

        score = 10000;
	    levelCompleted = 8;
	    bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score)
    {
        if(score > 1000)
        {
            return 1;
        }
        else if (score > 500 && score < 1000)
        {
            return 2;
        }
        else if (score > 100 && score < 500)
        {
            return 3;
        }
        return 4;

    }
}

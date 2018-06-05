package com.gertis;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Evan",500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        double inches1 = calcFeetAndInchesToCentimeters(1,12);

        double inches2 = calcFeetAndInchesToCentimeters(12);

        System.out.println(inches1);

        System.out.println(inches2);
        //Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >=0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and
        // return that value
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.

    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unamed player scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("Null score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet < 0)
        {
            return -1;
        }

        if(inches < 0 || inches >12)
        {
            return -1;
        }

        return (feet*(12.0/1)+inches)*2.54;

    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches <0)
        {
            return -1;
        }

        return calcFeetAndInchesToCentimeters(0, inches);
    }


}

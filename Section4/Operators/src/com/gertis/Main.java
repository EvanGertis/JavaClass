package com.gertis;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println("result - 1 = " + result);

        previousResult = result;

        result = result *10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/ 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        System.out.println("result is currently : " + previousResult);

        result++;
        previousResult = result;
        System.out.println("result++ : " + previousResult);

        previousResult = result;
        System.out.println("result is currently : " + previousResult);

        result--;
        previousResult = result;
        System.out.println("result-- : " + previousResult);

        previousResult = result;
        System.out.println("result is currently : " + previousResult);

        result+=2;
        previousResult = result;
        System.out.println("result+=2; : " + previousResult);

        previousResult = result;
        System.out.println("result is currently : " + previousResult);

        result*=2;
        previousResult = result;
        System.out.println("result*=2; : " + previousResult);

        previousResult = result;
        System.out.println("result is currently : " + previousResult);

        result/=3;
        previousResult = result;
        System.out.println("result/=3; : " + previousResult);

        boolean isAlien = false;

        if(isAlien == false)
        {
            System.out.println("It is not an alien");
        }

        int topScore = 80;
        if(topScore == 100)
        {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 91;
        if((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less then 100");
        }

        if((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if(newValue == 50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true)
        {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        // if the remainnig total(#4) is equal to 20 or less.

        double doubleVarOne = 20d;
        double doubleVarTwo = 80d;
        double sum = (doubleVarOne + doubleVarTwo) * 25.0d;
        double remainder =  ((doubleVarOne + doubleVarTwo) * 25.0) % 40;
        if(remainder <= 20)
        {
            System.out.println("The total was over the limit");
        }




    }
}

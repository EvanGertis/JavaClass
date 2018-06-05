package com.gertis;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while( count !=5)
        {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do
        {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100)
            {
                break;
            }
        }
        while(count !=5);

        int number = 5;
        int finishNumber = 30;
        int total = 0;
        while(number <= finishNumber)
        {
            if(!isEvenNumber(number))
            {
                number++;
                continue;
            }

            if(total >= 5)
            {
                break;
            }

            System.out.println("Even number " + number);
            number++;
            total++;
        }

        System.out.println("Total even numbers " +total);

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found



    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number)
    {

        if(number % 2 == 0) {
            return true;
        }
        else if(number % 2 != 0) {
            return false;
        }
        return false;
    }
}

package com.gertis;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("10,000 at 2% interst = " + calculateIntrest(10000.0,2.0));

        /*for(int i = 2; i < 9; i++)
        {
            System.out.println("10,000 at " + i + "% interst = " + String.format("%.0f", calculateIntrest(10000.0,i)));
        }

        for(int i = 8; i > 1; i--)
        {
            System.out.println("10,000 at " + i + "% interst = " + String.format("%.0f", calculateIntrest(10000.0,i)));
        }*/

        primeChecker(20,30);


    }

    public static void primeChecker(int n1, int n2)
    {
        int count = 0;

        for(int i = n1; i < n2; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println(i + " is a prime number");
                System.out.println("Total primes found: " +count);
            }

            if(count == 3)
            {
                break;
            }

        }
    }

    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
            return false;
        }

        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static double calculateIntrest(double amount, double interestRate)
    {
        return amount*interestRate/100;
    }
}

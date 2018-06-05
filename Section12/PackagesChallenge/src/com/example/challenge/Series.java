package com.example.challenge;

public class Series {

    public static int nSum(int n)
    {
        int nSum = 0;

        for(int i = 0; i < n + 1; i++ )
        {
            nSum += i;
        }

        return nSum;
    }

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int nFactorial = 1;

        for(int i = 1; i < n + 1; i++ )
        {
            nFactorial *= i;
        }

        return nFactorial;
    }

    public static int fibonacci(int n)
    {
        if( n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 1;
        }
        else
        {
            int[] fn = new int[n];
            fn[0] = 0;
            fn[1] = 1;

            for(int i = 0; i < n - 2; i++)
            {
                fn[i+2] = fn[i] + fn[i+1];

            }

            return fn[n-1];
        }
    }
}

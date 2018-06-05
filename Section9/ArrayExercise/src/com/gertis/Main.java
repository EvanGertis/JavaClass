package com.gertis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5,15 your program should
        // ultimately have an array with 106, 81, 26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted aray.

        int[] test = getIntegers(5);
        printArray(test);
        System.out.println("____");
        printArray(sortIntegers(test));


    }

    // gets the integers from keyboard input
    public static int[] getIntegers(int size)
    {
        int[] values = new int[size];

        System.out.println("Please enter 5 integers: ");

        for(int i = 0; i < size; i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Value" + i + " : " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array)
    {
        int[] reversedArray = new int[array.length];
        Arrays.sort(array);

        for(int i = array.length -1; i > 0; i--)
        {
            reversedArray[array.length - 1 - i] = array[i];
        }

        reversedArray[array.length -1] = array[0];



        return reversedArray;

    }
}

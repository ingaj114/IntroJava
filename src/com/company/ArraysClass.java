package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // An array is a collection of multiple data units of a single data type.
        // Indexing for an array start at 0
        // First way to declare an array (you have predetermined values)
//        int[] numbers = {4, 5, 0, 4};
//        System.out.println(numbers.length);

        //Second way to declare an array.
//        int[] numbers = new int[5]; //default value for int is 0
//        String[] textArr = new String[6]; //default value for objects including String is null
//
//        textArr[3] = "orange";

//        for (int i = 0; i < numbers.length; i++) {
        //prompt the user to enter a number;
//            System.out.print("Enter a number: ");
//            numbers[i] = scanner.nextInt();
//        }
        // Find the sum of the numbers;
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
        //       System.out.println(Arrays.toString(numbers));
        //       System.out.println("The sum of the variables is:"  + sum);

        //TASK 1
        //Write a program to find the average of a set of numbers that the user enters.
        //Allow the user to decide the number of integers to enter.
        //Interactively return the output to the console.
        System.out.print("How many numbers you want to average: ");
//        int numberHowMany = scanner.nextInt();
        int[] numbersTask = new int[scanner.nextInt()];

        for (int i = 0; i < numbersTask.length; i++) {
            System.out.print("Write numbers here: ");
            numbersTask[i] = scanner.nextInt();
        }
        float average = 0;
        for (int i = 0; i < numbersTask.length; i++) {
            average += numbersTask[i];
        }
        System.out.println("The average value of numbers " + Arrays.toString(numbersTask) + " is: " + (average/numbersTask.length));

    }
}
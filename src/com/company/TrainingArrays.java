package com.company;

import java.util.Arrays;

public class TrainingArrays {
    public static void main(String[] args) {
        //TASK 1
        //Write a Java program to sort a numeric array and a string array.
        int [] a = {10, 9, 8, 7 , 6 , 5, 4, 3, 2, 1};
        String [] string = {"d", "e", "b", "c", "a"};
        Arrays.sort(a);
        Arrays.sort(string);
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(string));

        //TASK 2
        int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sums = 0;
        for (int i = 0; i < b.length; i++) {
            sums += b[i];
        }
        //System.out.println(sums);

        //TASK 3
        int[][] cube = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //            System.out.printf("%2d", cube[i][j]);
            }
            System.out.println();
        }
        //TASK 4
        int [] array = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //    System.out.println(sum / array.length);

        //TASK 5
        //Write a Java program to test if an array contains a specific value.

        int [] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int n = 12;
        boolean found = false;
        for (int i: array2) {
            if (i == n) {
                found = true;
                break;
            }
        }
        /*if (found)
            System.out.println(n + " is found");
        else
            System.out.println(n + " is not found");*/

    }
}

package com.company;

import java.util.Scanner;

public class MethodsTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("How many numbers to write: ");
        int [] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input all the numbers on by one: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The smallest value is: " + findSmallestValue(numbers));*/
        /*System.out.print("How many numbers to write: ");
        int [] numbersAverage = new int[scanner.nextInt()];
        for (int i = 0; i < numbersAverage.length; i++) {
            System.out.print("Input all the numbers on by one: ");
            numbersAverage[i] = scanner.nextInt();
        }
        System.out.println("The average of numbers: " + findAverageValue(numbersAverage));*/
        /*System.out.print("Input a string: ");
        String dataInput = scanner.next();
        System.out.print("The middle character in the string: " + findMiddleChar(dataInput));*/

    }
        /*public static String findMiddleChar (String dataInput) {
            int position;
            int length;
            if (dataInput.length() % 2 == 0) {
                position = dataInput.length() / 2 - 1;
                length = 2;
            }
            else {
                position = dataInput.length() / 2;
                length = 1;
            }
            return dataInput.substring(position, length + position);
        }*/
        /*public static int findSmallestValue (int [] numbers) {
            int minValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
            }
            return minValue;
        }*/
        /*public static int findAverageValue (int [] numbersAverage) {

            int sum = 0;
            for (int i = 0; i < numbersAverage.length; i++) {
                sum += numbersAverage[i];
            }
            return sum / numbersAverage.length;
        }*/


}

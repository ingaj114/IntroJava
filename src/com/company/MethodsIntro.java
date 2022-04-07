package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MethodsIntro {
    // public - accessible throughout the project
    // class - a blueprint for describing object

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*        boolean evenValue = checkEven(7);
        System.out.print("enter a number to check: ");
        int numberToCheck = scanner.nextInt();
        System.out.println(checkEven(numberToCheck) ? "Number is even" : "Number is odd");

        System.out.print("Enter a string here: ");
        String consonantToCheck = scanner.nextLine();
        System.out.println("The consonants in string are: " + countConsonants(consonantToCheck));*/
        /*       System.out.print("Enter number count here: ");
        int[] count = new int[scanner.nextInt()];

        for (int i = 0; i < count.length; i++) {
            System.out.print("Enter numbers here: ");
            count[i] = scanner.nextInt();
        }
        System.out.println("The maximum value in the arrays is: "+ findMaximum(count));
        }*/
        System.out.print("Write a big number here: ");
        double bigNumber = scanner.nextDouble();
        System.out.print("Write a operator here: ");
        String operator = scanner.next();
        System.out.print("Write a small number here: ");
        double smallNumber = scanner.nextDouble();

        System.out.println("The result is: " + smallCalculator(bigNumber,smallNumber,operator));
    }
    // write a method that takes in a string and returns the number of consonants in the string
    // input should be from the user
        /*    public static int countConsonants (String word) {
        int vowelCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char character = word.toLowerCase().charAt(i);
            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                case ' ':
                    spaceCount++;
                    break;
            }
        }
        return word.length() - (vowelCount + spaceCount);
    }*/
    // write a method that takes in an array of numbers and returns the maximum number in array
    // N.B. do not use the Math.max method
        /*public static int findMaximum(int[] numberArray) {
            int max = numberArray[0];
            for (int i = 1; i < numberArray.length ; i++) {
                if(numberArray[i] > max) {
                    max = numberArray[max];
                }
            }
            return max;
        }*/
    // write a method that accepts three parameters, double smallNumber, double bigNumber, String operator
    // Based on the arithmetic operator passed, perform one of the following operations: + - / *
    // on the small and big number and return the result. Result should be double.
    public static double smallCalculator(double smallNumber,double bigNumber,String operator) {
        double result = 0;
        char[] operatorChar = operator.toCharArray();
        if (operatorChar[0] == '+') {
            result = smallNumber + bigNumber;
        } else if (operatorChar[0] == '*') {
            result = smallNumber * bigNumber;
        } else if (operatorChar[0] == '-') {
            result = (smallNumber - bigNumber);
        } else if (operatorChar[0] == '/') {
            result = (smallNumber/bigNumber);
        } else {
            System.out.println("Can`t recognize operator!");
        }
        return result;
    }
    // methods - is a vehicle or errand boy that you pass a series of instruction to
    // and it will return the output or result to you

//    public static boolean checkEven (int number) {
//        if (number % 2 == 0) return true;
//        else return false;
}


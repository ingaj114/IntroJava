package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayAssignments1st2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TASK
        // Write a program that receives some numbers based on the user’s choice
        // and then returns the largest number of the ones the user entered.

        System.out.print("How many numbers: ");
        int[] userInput = new int[scanner.nextInt()];
        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Write numbers here: ");
            userInput[i] = scanner.nextInt();
        }
        int max = userInput[0];
        for (int i = 1; i < userInput.length; i++) {
            if (userInput[i] > max) {
                max = userInput[max];
            }
        }
        System.out.println("Maximum value of array " + Arrays.toString(userInput) + " is " + max);

        // TASK
        // Write a program that accepts a String from the user and returns an array of integers representing the counts of each vowel in the String.
        // The array returned by your method should hold 5 elements: the first is the count of As, the second is the count of Es, the third Is, the
        // fourth Os, and the fifth Us
        System.out.print("Write string here: ");
        String userInput3 = scanner.nextLine();
        int[] vowelCount = new int[5];
        for (int i = 0; i < userInput3.length(); i++) {
            char userInput3Char = userInput3.toLowerCase().charAt(i);
            switch (userInput3Char) {
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                    break;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }
        System.out.println(Arrays.toString(vowelCount));

        // TASK
        // Write a program to return the second-largest number from a stream of inputted integers from the user
        System.out.print("How many numbers: ");
        int[] userInput2 = new int[scanner.nextInt()];
        for (int i = 0; i < userInput2.length; i++) {
            System.out.print("Write numbers here: ");
            userInput2[i] = scanner.nextInt();
        }
        Arrays.sort(userInput2);
        System.out.println("The 2nd largest value of " + Arrays.toString(userInput2) + " is " + userInput2[userInput2.length - 2]);

        // TASK
        // Write a program to find out if in a list of numbers entered by a user there are no multiples of 3

        // TASK
        // Write a program to find the average of a set of numbers that the user enters. Allow the user to decide the
        // number of integers to enter. Interactively return the output to the console.

        // TASK
        // Ask the user to enter a range of numbers and sort that group of numbers in such a way that even numbers
        // come first in the output and odd numbers are after the even numbers. The sorted version is [2,4,8,10,5,9,7,3]
        System.out.print("How many number you want to enter: ");
             int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Write your numbers here: ");
            numbers[i] = scanner.nextInt();
        }
        int[] oddEven = new int[numbers.length];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
                oddEven[counter - 1] = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                counter++;
                oddEven[counter - 1] = numbers[i];
            }
        }
        System.out.println("First even, then odd: " + Arrays.toString(oddEven));

        // TASK: You're given a string of words from the user. You need to find the word "Nemo", and return a string like this:
        // "I found Nemo at [the order of the word you find Nemo]!". If you can't find Nemo, return "I can't find Nemo :(".
        System.out.print("Write down a string: ");
        String findNemo = scanner.nextLine();
        String[] wordArray = findNemo.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase("Nemo")) {
                System.out.println("I found Nemo at word number " + (i + 1) + "!");
                break;
            }
            if (i == wordArray.length - 1 && !wordArray[i].equalsIgnoreCase("Nemo")) {
                System.out.println("I can't find Nemo :(");
            }
        }

        // TASK: Create a program that takes an array and returns the difference between the biggest and smallest numbers.
        System.out.print("How many numbers in an array: ");
        int[] userInput4 = new int[scanner.nextInt()];
        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Write down preferable numbers: ");
            userInput[i] = scanner.nextInt();
        }
        int maxValue = userInput4[0];
        int minValue = userInput4[0];
        for (int i = 1; i < userInput.length; i++) {
            if (userInput4[i] < minValue) minValue = userInput4[minValue];
            if (userInput4[i] > maxValue) maxValue = userInput4[maxValue];
        }
        System.out.println("The difference from biggest value " + maxValue +
                " to smallest value " + minValue + " is: " + (maxValue -  minValue));

        // TASK:  Create a program that takes an array of Strings (You can initialize the variable without user input)
        // and checks if the last item matches the rest of the array concatenated together. For example,
        // ["i", "love", "tesh", "ilovetesh"] will return true

        String[] arrayWords = {"i", "love", "to", "test", "ilovetotest"};
        String arrayString = "";
        for (int i = 0; i < arrayWords.length - 1; i++) {
            arrayString += arrayWords[i];
        }
        //condition                           //true        //false
        System.out.println(arrayString.equals(arrayWords[arrayWords.length - 1]) ? "match" : "don't match");

        // Write a Java program to rearrange the following array of unique elements such that each integer is greater than
        // the integers to it`s left and right
        // Array {3,5,9,10,7,2,1}
        // {1,3,2,7,5,10,9}

        int[] numbers2 = {3,5,9,10,7,2,1};
        for (int i = 1; i < numbers2.length; i+=2) {
            if (numbers2[i - 1] > numbers2[i]) {
                int temp = numbers2[i - 1];
                numbers2[i - 1] = numbers2[i];
                numbers2[i] = temp;
            }
            if (i + 1 < numbers2.length && numbers2[i + 1] > numbers2[i]) {
                int temp = numbers2[i + 1];
                numbers2[i + 1] = numbers2[i];
                numbers2[i] = temp;
            }
        }
        System.out.println("The resulting or rearranged array is: " + Arrays.toString(numbers2));

    }
}
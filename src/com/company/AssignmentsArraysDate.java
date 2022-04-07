package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class AssignmentsArraysDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("TASK 1");
        //Given a string from the user return the character and count of that character that occurs the most in the string
        System.out.print("Write a string here: ");
        String userInput2 = scanner.nextLine();
        int[] charFreq = new int[userInput2.length()];

        char maxChar = userInput2.charAt(0);
        int max;

        char string[] = userInput2.toCharArray();

        for (int k = 0; k < string.length; k++) {
            charFreq[k] = 1;
            for (int l = k + 1; l < string.length; l++) {
                if (string[k] == string[l] && string[k] != ' ') {
                    charFreq[k]++;
                }
            }
        }
        max = charFreq[0];

        for (int m = 0; m < charFreq.length; m++) {
            if (max < charFreq[m]) {
                max = charFreq[m];
                maxChar = string[m];
            }
        }
            System.out.println("Character that occurs the most in given string: " + maxChar);

        System.out.println("TASK 2");
        //Write a program that takes in the weight and height of 5 people from the user and returns the average BMI of the group
        int[] userWeight = new int[5];
        for (int i = 0; i < userWeight.length; i++) {
            System.out.print("Please write weight here (kg): ");
            userWeight[i] = scanner.nextInt();
        }
        double[] userHeight = new double[5];
        for (int i = 0; i < userHeight.length; i++) {
            System.out.print("Write height number here (m): ");
            userHeight[i] = scanner.nextDouble();
        }
        double sum = 0;
        double index = 0;
        for (int i = 0; i < userWeight.length; i++) {
            for (int j = 0; j < userHeight.length; j++) {
                index = (userWeight[i] / (Math.pow(userHeight[j], 2)));
            }
            sum += index;
        }
        System.out.println("Average BMI of the group: " + String.format("%.1f", (sum / 5)));
        System.out.println("TASK 3 not solved");*/
        //You`re sent to a grocery store with the following items on your list ["Bananas", "Bread", "Fish"]. The cost of
        //items in the store is [12, 5, 10], your current cash-in-hand is 20 dollars. Which of the items can you safely buy
        //without needing extra cash //Priority - bananas[least], fish[second], bread[first]

        String[] groceryList = {"Bananas", "Bread", "Fish"};
        int[] prices = {12, 5, 10};
        /*int breadPrice = 0;
        for (int i = 0; i < groceryList.length; i++) {
            if (groceryList[i].equalsIgnoreCase("bread")) {
                breadPrice = prices[i];
            }
        }*/

        int totalCost = prices[2] + prices[1];
        System.out.println("You can buy Fish and Bread and you'll be left with " + (20 - totalCost) + "dollars");

        //Arrays.sort(prices);

        System.out.println("TASK 4");
        /*Receive the year, month and day from the user separately
         - the year should be a four-digit number
         - assume that the date is correct
         Determine if the date is magic date
         A magic date occurs when:
         - m * d is a 1-digit number that matches the last 1-digit of the year. OR
         - m * d is a 2-digit number that matches the last 2-digit of the year. OR
         - m * d is a 3-digit number that matches the last 3-digit of the year.*/
        System.out.print("Write a date here please (yyyy-mm-dd): ");
        String dateInput = scanner.next();

        //return as integer //split the string around regex
        int year = Integer.parseInt(dateInput.split("-")[0]);
        int month = Integer.parseInt(dateInput.split("-")[1]);
        int day = Integer.parseInt(dateInput.split("-")[2]);
/*        //return as string //return string to array
        String temp = Integer.toString(year);
        int[] digits = new int[temp.length()];
        for (int n = 0; n < temp.length(); n++) {
               digits[n] = temp.charAt(n) - '0';
        }*/
/*        //return array to string
        int digitsTwoEnd = 0;
        for (int o = 0; o < digits.length; o++)
            digitsTwoEnd = 10 * digitsTwoEnd + digits[o];*/
        String temp = Integer.toString(year);
        String oneDigit = temp.substring(3);
        String twoDigit = temp.substring(2);
        String treeDigit = temp.substring(1);

        int result1 = Integer.parseInt(oneDigit);
        int result2 = Integer.parseInt(twoDigit);
        int result3 = Integer.parseInt(treeDigit);

        int f = month * day;

        String result = (f == result1 || f == result2 || f == result3) ? "It is a magic date!" : "Sorry! It is not a magic date!";
        System.out.println(result);
    }
}

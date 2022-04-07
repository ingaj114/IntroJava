package com.company;
import java.util.Scanner;

public class MaxMinChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TASK
        //Given a string from the user return the character and count of that character that occurs the most in the string
        System.out.print("Write a string here: ");
        String userInput2 = scanner.nextLine();
        int[] charFreq = new int[userInput2.length()];
        char minChar = userInput2.charAt(0);
        char maxChar = userInput2.charAt(0);
        int min, max;
        //Converts given string into character array
        char string1[] = userInput2.toCharArray();
        //Count each word in given string and store in array freq
        for (int i = 0; i < string1.length; i++) {
            charFreq[i] = 1;
            for (int j = i + 1; j < string1.length; j++) {
                if (string1[i] == string1[j] && string1[i] != ' ' && string1[i] != '0') {
                    charFreq[i]++;
                    //Set string[j] to 0 to avoid printing visited character
                    string1[j] = '0';
                }
            }
        }
        //Determine minimum and maximum occurring characters
        min = max = charFreq[0];
        //If min is greater than frequency of a character
        //then, store frequency in min and corresponding character in minChar
        for (int i = 0; i < charFreq.length; i++) {
            if (min > charFreq[i] && charFreq[i] != '0') {
                min = charFreq[i];
                minChar = string1[i];
            }
            if (max < charFreq[i]) {
                max = charFreq[i];
                maxChar = string1[i];
            }
        }
        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}

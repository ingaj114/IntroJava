package com.company;
import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // TASK 1:
        // Write a program to compare two strings by their length and return
        // output that tells the user if the strings are equal or not. //use equals
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first phrase: ");
        String phrase1 = scanner.next();
        System.out.println("Enter second phrase: ");
        String phrase2 = scanner.next();
        if (phrase1.equals(phrase2)) {
            System.out.println(phrase1 + " and " +  phrase2 + " strings are equal!");
        } else System.out.println(phrase1 + " and " + phrase2 + " strings are not equal!");
        scanner.close();

        // TASK 2:
        // Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.

        String rString = "";
        int rNumber = 4;
        for (int i = 0; i < rNumber; i++) {
            rString += "r";
        }
        System.out.println("bu" + rString + "p");

        // TASK 3:
        // Write a program to remove the first and last letters of a string. e.g. hello becomes ell.
        String removeLetters = "hello";
        System.out.println(removeLetters.substring(1, removeLetters.length() - 1));

        // TASK 4:
        // Write a program to reverse a string and capitalize all the letters. e.g. hello becomes OLLEH.
        String str = "hello";
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev += str.charAt(i);
        }
        System.out.println(strRev.toUpperCase());

    }
}

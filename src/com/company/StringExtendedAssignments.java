package com.company;
import java.util.Scanner;

public class StringExtendedAssignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TASK 1
        //  Write a program that returns true interactively,
        //  if a user enters a string containing any of these characters:
        //  'u', 'w', '6', 'i', 'b', 'q'
//        System.out.println("Lets find out which characters we imagine.");
//        System.out.print("Write down a word here: ");
//        String userInput = scanner.nextLine();
//        for (int i = 0; i < userInput.length(); i++) {
//            char userInputChar = userInput.charAt(i);
//            switch(userInputChar) {
//                case 'u':
//                case 'w':
//                case '6':
//                case 'i':
//                case 'b':
//                case 'q':
//                    System.out.println("Returns true. There is " + userInputChar + " 'u' in a string " + userInput);
//                default:
//                    System.out.println("Returns false.");
//                    break;
//            }
//        }
        //TASK 1 Solution 2
        //  Write a program that returns true interactively,
        //  if a user enters a string containing any of these characters:
        //  'u', 'w', '6', 'i', 'b', 'q'
//        System.out.println("Lets find out which characters we imagined.");
//        System.out.print("Write down a word here: ");
//        String userInput = scanner.nextLine();
//        String responseString = "";
//        String errorString = "";
//        for (int i = 0; i < userInput.length(); i++) {
//            //Pick out a particular character to be checked
//            char userInputChar = userInput.toLowerCase().charAt(i);
//            switch (userInputChar) {
//                case 'u':
//                case 'w':
//                case '6':
//                case 'i':
//                case 'b':
//                case 'q':
//                    responseString = "Returns true. There is a " + userInputChar + " in a string " + userInput + ".";
//                default:
//                    errorString = "Returns false.";
////                    break;
//            }
//        }
//        if (responseString.isEmpty()) {
//            System.out.println(errorString);
//        } else {
//            System.out.println(responseString);
//        }
        //    TASK 2
        //    Write a program that accepts a String from a user and prints an interactive response telling the user if the word
        //    is the same when spelt backwards. For example, bread when spelt backwards is daerb, which isn't quite the same.
//            System.out.print("Think of a word that spells the same backward: ");
//            String string = scanner.nextLine();
//            String stringReverse = "";
//            for (int i = string.length() - 1; i >= 0; i--) {
//                stringReverse += string.charAt(i);
//            }
//            if (string.equalsIgnoreCase(stringReverse)) {
//                System.out.println("The " + string + " are the same as " + stringReverse + ": therefore, a palindrome.");
//            } else {
//                System.out.println("The " + string + " aren't the same as " + stringReverse + ": therefore, not a palindrome");
//            }
        // TASK
        //    Write a program that accepts any of the primary colors as a String and returns the complimentary
        //    color of that color to the user.
        System.out.print("Think of a primary color of a light: ");
        String color = scanner.nextLine();
        //        if (color.equals("red")) {
        //            System.out.println("Secondary color of red is yellow and magenta.");
        //        } else if (color.equals("green") ) {
        //            System.out.println("Secondary color of green is yellow and cyan.");
        //        } else if (color.equals("blue")) {
        //            System.out.println("Secondary color of blue is magenta.");
        //        } else {
        //            System.out.println("That is not a primary color.");
        //        }
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Complementary color of red is cyan.");
                break;
            case "green":
                System.out.println("Complementary color of green is magenta.");
                break;
            case "blue":
                System.out.println("Complementary color of blue is yellow.");
                break;
            default:
                System.out.println("That is not a primary color.");
        }

    }
}

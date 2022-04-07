package com.company;

public class StringTest {
    public static void main(String[] args) {
//        // A String is basically anything inside of double-quotes ("").
//        // Strings are immutable. This means they can not be changed.
//        // Strings in java are case-sensitive because it sees upperCase alphabet and lower case alphabet differently.
//        System.out.println("I love coding!"); // String literal.
//
//        // Two main ways to create strings
////      String objectString = new String("I am going home"); // This type takes more space and is unideal.
        String regularString = "I am going to the beach";
//        // The index of the first character in a string is 0.
//        // The index of the last character in a string is less than the length of the string by 1.
//
//       System.out.println(regularString.length());
        int counter = 0;
        for (int i = 0; i < regularString.length(); i++) {
//            System.out.println(regularString.toLowerCase());
            if ('a' == regularString.toLowerCase().charAt(i))  {
                counter++;
            }
        }
        System.out.println("The number of times 'a' appeared is " + counter);

        // Task 1:
        // Write a program to count the number of times a vowel appears in a word. Any vowel from the alphabet.
        // Ex: Physician. Ex: Aerodynamics.

        String str1 = "Physician";
        String str2 = "Aerodynamics";
        int counter1 = 0, counter2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if ('a' == str1.toLowerCase().charAt(i) || 'e' == str1.toLowerCase().charAt(i) || 'i' == str1.toLowerCase().charAt(i)
                    || 'o' == str1.toLowerCase().charAt(i) || 'u' == str1.toLowerCase().charAt(i)) {
                counter1++;
            }
        }
        System.out.println("The number of times a vowel appeared is " + counter1);

        for (int i = 0; i < str2.length(); i++) {
            if ('a' == str2.toLowerCase().charAt(i) || 'e' == str2.toLowerCase().charAt(i) || 'i' == str2.toLowerCase().charAt(i)
                    || 'o' == str2.toLowerCase().charAt(i) || 'u' == str2.toLowerCase().charAt(i)) {
                counter2++;
            }
        }
        System.out.println("The number of times a vowel appeared is " + counter2);

    }
}
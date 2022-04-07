package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class TrainingString {
    public static void main(String[] args) {
        //TASK
        /*String userInput = "Java Exercises!";
        System.out.println(userInput);
        System.out.println("The character at position 0 is " + userInput.charAt(0));
        System.out.println("The character at position 10 is " + userInput.charAt(10));*/

        //TASK
        /*String userInput2 = "This is exercise 1";
        String userInput3 = "This is Exercise 1";

        int result = userInput2.compareToIgnoreCase(userInput3);
        if (result < 0) {
            System.out.println("\""+ userInput2+"\"" + " < " +userInput3+"\"");
        } else if (result == 0){
            System.out.println("\""+userInput2+"\"" + " equals \"" + userInput3+"\"");
        } else {
            System.out.println("\"" +userInput2+"\"" + " > " +userInput3+"\"");
        }*/

        //TASK
        /*String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println(str1.contains(str2));*/

        //TASK
        /*String str1 = "example.com";
        String str2 = "example.com";

        String str3 = "example.com";
        String str4 = "example.com";

        StringBuffer buffer1 = new StringBuffer(str1);

        System.out.println(str2.contentEquals(buffer1));
        System.out.println(buffer1.insert(2,"le"));*/

        //TASK
        /*char [] arr = {'1', '2', '3', '4', '5'};
        String str = String.copyValueOf(arr,1,3);
        System.out.println(str);*/

        //TASK
        /*String str = "Python Exercises";
        String str2 = "Python Exercise";
        String end = "se";
        System.out.println(str.endsWith(end));
        System.out.println(str2.endsWith(end));*/

        //TASK
        /*String str = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Walter winchell";

        System.out.println(str.contentEquals(str2));
        System.out.println(str2.equalsIgnoreCase(str3));*/

        //TASK
        /*Calendar calendar = Calendar.getInstance();
        System.out.println("Current date and time: ");
        System.out.format("%tB %te, %tY%n", calendar, calendar, calendar);
        System.out.format("%tH:%tM:%tS", calendar, calendar, calendar);*/

        //TASK
        /*String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append("Exercises").toString();
        String str3 = str2.intern();
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);*/

        //TASK
        /*String str1 = "Red Green Orange Yellow";
        String str2 = "Red Green Orange Yellow";
        System.out.println(str1.matches(str2));

        boolean bool1 = str1.regionMatches(0, str2, 28, 8);
        System.out.println(bool1);
        System.out.println(str1.regionMatches(9, str2, 9, 8));*/

        //TASK
        /*String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str.replace('d', 'f'));*/

        //TASK
        /*String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str.replaceAll("fox", "cat"));*/

        //TASK
        /*String str = "Red is favorite color";
        String str2 = "Orange is also my favorite color";
        String newStr = str.toLowerCase();

        System.out.println(newStr.startsWith("red"));
        System.out.println(str2.startsWith("Red"));*/

        //TASK
        /*String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str.substring(10, 25));*/

        //TASK
        /*String str = "Java Exercises";
        char [] arr = {};
        arr = str.toCharArray();
        System.out.println(arr);*/

        //TASK
        /*String str = "    Java Exercises. ";
        System.out.println(str.trim());*/

        //TASK not solved
        /* String str = "thequickbrownfoxxofnworbquickthe";

        for (int i = 0; i < str.length(); i++) {

        }*/

        //TASK
        /*String str = "successes";
        int[] counter = new int[4];

        for (int i = 0; i < str.length(); i++) {
            char newStr = str.charAt(i);
            switch (newStr) {
                case 's':
                    counter[0]++;
                    break;
                case 'u':
                    counter[1]++;
                    break;
                case 'c':
                    counter[2]++;
                    break;
                case 'e':
                    counter[3]++;
                    break;
            }
        }
        int max = counter[0];
        for (int i = 1; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
            }
        }
        System.out.println("[s, u, c, e]");
        System.out.println(Arrays.toString(counter));*/

    }
}

package com.company;
import java.util.Scanner;
public class RecursionAssignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1: " + sum(8));

        System.out.print("Task 2: ");
        System.out.println(reverse("This string will be reversed!"));

        System.out.print("Check whether number is prime: ");
        int prime = scanner.nextInt();
        int i = 2;
        System.out.println(prime + isPrimeNumber(prime,i));
    }

    // Using recursion, write a method that takes a number as a parameter and returns the total sum between one and that number;
    // upToNumber(8) -> 1 + 2 + .. + 8;
    public static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
    // Using recursion, write a program or method takes a string as a parameter and returns the reverse of the string
    public static String reverse(String str) {
        if (str.length() == 0)
            return null;
        else if (str.length() == 1) {
            return str;
        } else {
            System.out.print(str.charAt(str.length()-1));
        }
        return reverse(str.substring(0,str.length()-1));
    }
    // Write a method that accepts an integer and returns whether that integer is a prime number or not.
    // A prime number is a number that isn't divisible without a remainder by any other numbers apart from one and itself
    // is prime(9) -> 9 is not prime
    public static String isPrimeNumber(int prime, int i) {
        if (prime <= 2)
            return (prime == 2) ? " prime" : " not a prime";
        else if (prime % i == 0)
            return " not a prime";
        else if (i * i > prime)
            return " a prime number";
        else
            return isPrimeNumber(prime, i + 1);
    }

}




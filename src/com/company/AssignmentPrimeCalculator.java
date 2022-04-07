package com.company;

public class Assignment {
    public static void main(String[] args) {
//    TASK: Write a program that will output the prime numbers between 1 - 80.
//      Prime number is a numbers that can only be divided by 1 and itself without giving any remainders
        for (int i = 1; i <= 80; i++) { // run from 1 to 80
            int counter = 0; //initialize counter to count the number of numbers that divide i
            for (int j = 2; j <= i / 2; j++) { //nested loop
                if (i % j == 0) { //if this return true we know it`s not prime
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(i + " is prime");
            }
        }

//    TASK: Write a program that will act as a simple calculator where you set a variable as the operator and based on that
//      perform an arithmetic operation. For example if the operator variable is "+" then it will add two numbers and so on.
        char operator = '/';
        int numberBig = 15;
        float numberSmall = 3;

        if (operator == '+') {
            System.out.println("The sum is " + (numberBig + numberSmall));
        } else if (operator == '-') {
            System.out.println("The difference is " + (numberBig - numberSmall));
        } else if (operator == '*') {
            System.out.println("The product is " + numberBig * numberSmall);
        } else if (operator == '/') {
            System.out.println("The quotient is " + numberBig / numberSmall);
        } else {
            System.out.println("Operator not recognized!");
        }
        //continue - used to skip an interation (one movement loop)
        //break - stop the loop immediately
        //return - typically

        for (int i = 2; i <20; i++) {
            if (i % 2 != 0) {
                return;
            }
            System.out.println(i);
        }

    }
}


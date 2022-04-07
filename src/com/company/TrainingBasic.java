package com.company;
import java.util.Scanner;

public class TrainingBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TASK
        /*System.out.print("Input a number: ");
        int input = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(input + " * " + (i) + " = "+ (input * i));
        }*/

        //TASK
        /*double formula = 4 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(formula);*/

        //TASK
        /*double r = 7.5;
        double pi = Math.PI;

        System.out.println("Perimeter is: " + 2 *r*pi);
        System.out.println("Area is: " + pi*(Math.pow(r,2)));*/

        //TASK
        /*System.out.print("Write a number: ");
        int number1 = scanner.nextInt();
        System.out.print("Write a number: ");
        int number2 = scanner.nextInt();
        System.out.print("Write a number: ");
        int number3 = scanner.nextInt();
        System.out.print("Write a number: ");
        int number4 = scanner.nextInt();
        System.out.print("Write a number: ");
        int number5 = scanner.nextInt();

        System.out.println("Average value of numbers is: " + (number1+number2+number3+number4+number5)/5);*/

        //TASK
        /*double num1 = 5.6;
        double num2 = 8.5;
        System.out.println("Area is " + num1 * num2);
        System.out.println("Perimeter is " + 2 *(num1 + num2));*/

        //TASK
        /*int var1 = 5;
        int var2 = 10;
        int temp = var2;
        var2 = var1;
        var1 = temp;

        System.out.println(var1);
        System.out.println(var2);*/

        //TASK
        /*int first = 25;
        int second = 39;

       if (first == second) System.out.printf("%d == %d%n", first, second);
       if (first != second) System.out.printf("%d != %d%n", first, second);
       if (first >= second) System.out.printf("%d >= %d%n", first, second);
       if (first <= second) System.out.printf("%d <= %d%n", first, second);
       if (first > second) System.out.printf("%d > %d%n", first, second);
       if (first < second) System.out.printf("%d < %d%n", first, second);*/

        //TASK
        /*int s = 6;
        int n = 7;
        double pi = Math.PI;
        double result1 = n * Math.pow(s,2);
        double result2 = 4 * Math.tan(pi/n);
        double result = result1/result2;
        System.out.println("The are polygon " + result);*/

        //TASK
        /*System.out.print("Input a string: ");
        char[] string = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = string.length - 1; i >= 0; i--) {
            System.out.print(string[i]);
        }*/

        //TASK
        /*String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] strChar = str.toCharArray();
        int letter = 0;
        int number = 0;
        int space = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(strChar[i])) {
                letter++;
            }
            else if (Character.isDigit(strChar[i])) {
                    number++;
            }
            else if (Character.isSpaceChar(strChar[i])) {
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("Letter: " + letter + " space: " + space + " number: " + number + " other: " + other);*/

        //TASK
        /*int amount = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (k!= i && k != j && i != j) {
                        amount++;
                        System.out.println(i + "" + j + "" + k + "");
                    }
                }
            }
        }
        System.out.println(amount);*/

        //TASK

    }
}

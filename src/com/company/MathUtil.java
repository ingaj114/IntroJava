package com.company;
import java.util.Scanner;

public class MathUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.max(2, 3));

        // TASK
        System.out.print("Write base value of triangle: ");
        float baseValue = scanner.nextFloat();
        System.out.print("Write height value of triangle: ");
        float heightValue = scanner.nextFloat();

        double triangleArea = 0.5 * baseValue * heightValue;
        System.out.println("The area of triangle is: " + triangleArea);

        // TASK
        System.out.print("Write value a: ");
        double a = scanner.nextInt();
        System.out.print("Write value b: ");
        double b = scanner.nextInt();
        System.out.print("Write value c: ");
        double c = scanner.nextInt();

        System.out.println("1x quadratic formula");
        double set = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        System.out.println((-b + set)/2*a);

        System.out.println("2x quadratic formula");
        System.out.println((-b - set)/2*a);

    }
}
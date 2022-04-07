package com.company;
import java.time.Month;
import java.time.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class MathAssignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TASK
//        Write a Java program to find maximum product of two integers in a given array of integers
//        Examples: Input : numbers = { 2, 3, 5, 7, -7, 5, 8, -5 }
//        Output: Pair is (7, 8, Maximum Product: 56
        int[] numbers = {2, 3, 5, 7, -7, 5, 8, -5};
        Arrays.sort(numbers);
        System.out.println("Pair is (" + (numbers[numbers.length-1]) + ", " + (numbers[numbers.length-2]) +
                ", Maximum Product: " + (numbers[numbers.length-1]) *(numbers[numbers.length-2]) + ")");

        // TASK
//        Write a Java program to find minimum sub-array sum of specified size in a given array of integers
//        Example: Input: numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//        Output: Sub-array size: 4
//        Sub-array from 0 to 3 and sum is: 10

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Sub-array size: ");
        int end = scanner.nextInt();
        System.out.print("Sub-array starts from [index]: ");
        int start = scanner.nextInt();
        int[] subArray = new int[end - start];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = arr[start + i];
        }
        int counter = 0;
        for (int i = 0; i < subArray.length + 1; i++) {
            counter += i;
        }
        System.out.println("Sub-array size: " + end);
        System.out.println("Sub-array from " + start + " to " + (end-1) + " and sum is: " + counter);
        System.out.println(Arrays.toString(subArray));

        System.out.println("Task 2:");
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.print("Sub-array size: ");
        int arrSize = 4;
        int minValue = array[0];
        for (int i = 1; i < arr.length; i++) {
            if (array[i] < minValue) {
                minValue = arr[minValue];
            }
        }
        int[] subArray2 = new int[arrSize];
        for (int i = 0; i < subArray2.length; i++) {
            subArray2[i] = arr[arrSize + i];
        }

        int counter2 = 0;
        for (int i = 0; i < subArray2.length + 1; i++) {
            counter2 += i;
        }
        System.out.println("Sub-array size: " + arrSize);
        System.out.println("Sub-array from " + (minValue - 1) + " to " + (arrSize - 1) + " and sum is: " + counter);

        // TASK
        // Ask the user to enter the sides of a right-angled triangle, a, b, c
        // Find the area of the triangle. Formula.

        System.out.print("Write number for side a: ");
        double a = scanner.nextDouble();
        System.out.print("Write number for side b: ");
        double b = scanner.nextDouble();
        System.out.print("Write number for side c: ");
        double c = scanner.nextDouble();
        double[] triangle = {a, b, c};
        double area = (b * c)/2;
        Arrays.sort(triangle);

        if (Math.pow(triangle[0], 2) + (Math.pow(triangle[1], 2)) == Math.pow(triangle[2],2)) {
            System.out.println("The are of right-angled triangles is: " + area);
        } else {
            System.out.println("Not a right-angled triangle");
        }

        // TASK
        // Write a program to return the fibonacci sequence up to a specified length by the user
        System.out.print("How many Fibonacci numbers to return?: ");
        int count = scanner.nextInt();
        int[] numbers2 = new int[count];

        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i < count; i++) {
            numbers2[i] = numbers2[i-1] + numbers2[i-2];
        }
        System.out.println(Arrays.toString(numbers2));

        //Date class

        Date date = new Date();
        System.out.println(date);
        System.out.println(LocalTime.now());
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        // TASK
        // A leap year is a year with an additional day in it, because of the month of february
        // Write a program that accepts a year from a user and tells the user if the year is a lepa year or no

        //System.out.print("Enter a year: " );
        //int year = scanner.nextInt();

        //boolean isLeap = LocalDate.of(year, Month.DECEMBER, 03).isLeapYear();
        //System.out.println(isLeap ? "local leap year" : "not local leap year");

        //boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        //System.out.println(isLeap ? "is leap year" : "is not leap year");

        //TASK
        //Write a program that returns the number of amount of hours between two (o'clock) times entered by the user
        System.out.print("Enter the start hour (x:00 PM): "); //8:00 PM
        String userStart = scanner.nextLine();
        System.out.print("Enter the end hour(x:00 AM): "); //9:00 AM
        String userEnd = scanner.nextLine();

        int startHour = Integer.parseInt(userStart.split(":")[0]);
        int endHour = Integer.parseInt(userEnd.split(":")[0]);

        int startHourOne = userStart.split(" ")[1].equals("AM") ? 12 : 24;
        int startHourTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;

        int difference = (endHour + startHourTwo) - (startHour + startHourOne);
        if (startHourOne < startHourTwo && startHour > endHour) difference += 12;

        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");

        //Write a Java program to get year and months between two dates.

        LocalDate today = LocalDate.now();
        LocalDate userDay = LocalDate.of(2020, Month.JUNE, 23);

        Period difference2 = Period.between(userDay, today);

        System.out.println("The difference " + userDay + " - " + today + ": " +  difference2.getYears() +
                " years" + " and " + difference2.getMonths() + " months.");

        //Write a Java program to calculate the difference between two dates in days.

        //LocalDate userDate1 = LocalDate.of(2022, 1, 3);
        LocalDate userDate1 = LocalDate.of(2020, 6, 23);
        LocalDate userDate2 = LocalDate.of(2022, 3, 22);

        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userDate1, userDate2));
        System.out.println("The difference between them in days is: " + numberOfDaysBetween);

        //TASK
        //Write a program to calculate the age of person, considering that they (the user) only enters their date of birth

        System.out.print("Write your year of birth (yyyy-mm-dd): ");
        String year = scanner.nextLine();

        LocalDate userBirthday = LocalDate.parse(year);
        LocalDate today2 = LocalDate.now();

        Period years = Period.between(userBirthday, today2);
        System.out.println("User age is: " + ChronoUnit.YEARS.between(userBirthday, today2) + " years");

        // TASK
        // Write a program to calculate the number of days between two specified years

        System.out.print("Write 1st date here (yyyy-mm-dd): ");
        String firstDate = scanner.nextLine();
        System.out.print("Write 2st date here (yyyy-mm-dd): ");
        String secondDate = scanner.nextLine();

        LocalDate firstDateToPer = LocalDate.parse(firstDate);
        LocalDate secondDateToPer = LocalDate.parse(secondDate);

        Period years1 = Period.between(firstDateToPer, secondDateToPer);
        System.out.println("The days between given dates is: " + ChronoUnit.DAYS.between(firstDateToPer, secondDateToPer) + " days");

    }
}
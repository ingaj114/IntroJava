package com.company.oop;
import java.util.Scanner;
import javax.xml.transform.Result;

public class OOPintro {
    // OOP -> programming paradigm
    // paradigm -> a way of viewing things

    // Encapsulation
    // This is a concept of hiding data and methods from the outside world
    // Classes outside of the one the data is defined in
    // This allows us to control what data is given out or received


    // A class is a blueprint for describing an object
    // car -> Attributes: color, model, numOfTires, numOfSeats.
    // Behaviour: startsEngine, stopEngine, turnRight, turnLeft
    // fields -> used to define attributes in a method
    public static void main(String[] args) {
    /*  Car benz = new Car();
        benz.startEngine(false);
        benz.stopEngine();

        System.out.println();

        Car bmw = new Car();
        bmw.startEngine(true);
        bmw.stopEngine();*/
    /*System.out.println(Calculator.add(2,4));
        System.out.println(Calculator.subtract(2,4));
        System.out.println(Calculator.multiply(2,4));
        System.out.println(Calculator.divide(3,9));*/

      /*Person george = new Person("George", 28);
        Person victoria = new Person("Victoria", 29);

        System.out.println(george.getName());
        System.out.println(victoria.getName());

        System.out.println(victoria.getAge());*/

        // For the person class we have written today write a method that
        // allows you to find a BMI of a particular person, using what you
        // have learned today. height should be in meters and the weight should be in kg
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a weight: ");
        double scannerWeight = scanner.nextDouble();
        System.out.print("Please enter a height: ");
        double scannerHeight = scanner.nextDouble();

        oopBMI person1 = new oopBMI(scannerWeight, scannerHeight);

        System.out.print("With a weight " + person1.getWeight() + " kg "
                + "and height " + person1.getHeight() + " cm, the BMI is " +
                Math.round(person1.ResultBMI()));

    }
}

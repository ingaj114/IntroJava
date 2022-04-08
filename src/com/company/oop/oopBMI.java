package com.company.oop;

public class oopBMI {
    // For the person class we have written today write a method that
    // allows you to find a BMI of a particular person, using what you
    // have learned today. height - in meters and the weight - in kg.
    private double weight;
    private double height;


    public oopBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public double ResultBMI() {
    return weight/Math.pow(height,2);
    }
}



package com.company.oop.car;

public class Car_assign {
    // Define the attributes of the object
    private String color = "Blue";
    private int numOfTires = 4;
    private boolean engineOn = false;

    // Define their behaviours
    // start engine

    public void startEngine(boolean key) {
        if (key && !engineOn) {
            System.out.println("Engine started");
            engineOn = true;
        } else {
            System.out.println("Key not in! Can`t start");
        }
    }
    public void stopEngine() {
        if (engineOn) {
            System.out.println("Engine turned off");
            engineOn = false;
        } else {
            System.out.println("Engine already off!");
        }
    }

}

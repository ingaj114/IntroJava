package com.company.oop.car;

import com.company.oop.Car_assign;

public class Ferrari extends Car_assign {

    private final String model = "Turbo 3000";

/*    private String color = "Blue";
    private int numOfTires = 4;
    private boolean engineOn = false; */

    // Method overriding
    public void startEngine(boolean key) {
        System.out.println(model + " started");
    }
}

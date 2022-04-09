package com.company.oop.car;

public class Birds extends Animal {
    String color = "yellow";
    boolean flying = true;
    String sing = "tweeting";

    public String sound() {
        return "Sound of " + name + " is " + sound;
    }
    public String movement() {
        return "Movement of " + name + " is " + move;
    }
    public static boolean isFlying() {
        return true;
    }
    public String sing() {
        return sing;
    }

}

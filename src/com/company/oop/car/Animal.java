package com.company.oop.car;

public class Animal {
    String name = "lion";
    int legs = 4;
    String sound = "roar";
    String move = "elegant";

    public String sound() {
        return "Sound of " + name + " is " + sound;

    }
    public String movement() {
        return "Movement of " + name + " is " + move;
    }

    public static void main(String[] args) {

            //Write two classes:
            // Animal class -> String name,  number of legs
            // Methods -> sounds it makes, Movement

            // Bird class - > fields: color, doesItFly?
            // Methods - > fly(), sing()
            // (inherits methods from animal class)

            Animal animal = new Animal();
            System.out.println(animal.movement());
            System.out.println(animal.sound());
            Birds bird = new Birds();
            System.out.println("Does bird fly: " + Birds.isFlying());
            System.out.println("The song is: " + bird.sing);
    }
}

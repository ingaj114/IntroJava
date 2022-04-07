package com.company.oop;

public class Person {

    //Define the properties or attributes of a person
    private String name;
    private int age;

    //Constructor - a constructor is a utility that allows us to
    // create instances of objects

    // Method/Constructor overloading -> this is a way to define multiple constructors or methods
    // with the same name but have different method/constructor signatures

    // Method/Constructor signatures -> this is the number and data type of the parameter and
    // the order in which those parameters are defined

/*    public Person() {
    }*/

/*    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
    // getters - allows us read data from the class
    // setters - allows us write a data to the class

    /*    public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge() {
            this.age = age;
        }*/
    private double weight;
    private double height;

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    /*    public void setWeight() {
            this.weight = weight;
        }*/
    public double getHeight() {
        return height;
    }
    /*    public void setHeight() {
            this.height = height;
        }*/
    public double Result() {
        return weight/Math.pow(height,2);
    }
}

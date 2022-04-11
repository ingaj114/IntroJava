package com.company.oop.assign;

public class Employee extends Person {

    private String name;
    private int age;
    private long companyID;
    private String companyName;

    public Employee(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public static float getAveAge(Person[] people) {
        float sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum / people.length;
    }

}

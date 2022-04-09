package com.company.oop.assign;

public class Company extends Employee {
    private String name;
    private int age;
    private long companyID;
    private String companyName;

    public Company(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Luise", 25),
                new Person("Signe", 27),
                new Person("Cristine", 29),
                new Person("Lele", 45),
                new Person("Olaf", 39),
        };
        System.out.println("Average age of employees is " + getAveAge(people));
    }
}

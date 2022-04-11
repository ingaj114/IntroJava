package com.company.oop.assign;

public class Company {

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Luise", 25),
                new Person("Signe", 27),
                new Person("Cristine", 29),
                new Person("Lele", 45),
                new Person("Olaf", 39),
        };

        System.out.println("Average age of employees is " + Employee.getAveAge(people));

    }

}

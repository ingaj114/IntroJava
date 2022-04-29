package com.company.oop.assign;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        String google = "Google", microsoft = "Microsoft" ;
        Employee[] googleWorkers = new Employee[] {
                new Employee("Fred", 33, 245, google),
                new Employee("Rachel", 38, 246, google),
        };
        Employee[] microsoftWorkers = new Employee[] {
                new Employee("John", 24, 2123, microsoft),
                new Employee("Anna", 28, 2124, microsoft),
        };
        Company goog = new Company(google, googleWorkers);
        Company micro = new Company(microsoft, microsoftWorkers);

        System.out.println(goog.getAveAge(googleWorkers));
        System.out.println(micro.getAveAge(microsoftWorkers));
//         Assuming you were assigned a task to create a roster for
//         employees that will decide who will work the night shift
//         based on random basis.
//         Write a method in your Company objection/class that
//         will return a random employee, from the list of employees
//         anytime the method is called
        System.out.println(goog.getRandomEmployee());

    }
}


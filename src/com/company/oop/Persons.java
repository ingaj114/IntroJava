package com.company.oop;

public class Persons {

    //define properties of the class
    private final Person[] people;

    public Persons(Person[] people) {
        this.people = people;
    }

    /*public float getAverageAge(Person[] people) {
        float sum = 0;
        // for-each loop
        for (Person person : people) {
            // person == person[i]
            sum += person.getAge();
        }
        return sum / people.length;
    }*/
}


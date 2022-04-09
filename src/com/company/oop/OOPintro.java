package com.company.oop;

public class OOPintro {
    // OOP -> programming paradigm
    // paradigm -> a way of viewing things

    // Encapsulation
    // This is a concept of hiding data and methods from the outside world
    // (Classes outside of the one the data is defined in)
    // This allows us to control what data is given out or received

    // Inheritance
    // This is a mechanism that allows us to share behaviour between classes
    // A class that inherits from another class is called the 'child' or 'sub' class.
    // The class that is inherited from is the 'parent' or 'super' class

    // Polymorphisms
    // The ability of an object to return different to the same method call.

    // A class is a blueprint for describing an object
    // Car -> Attributes: color, model, numOfTires, numOfSeats.
    // Another name for field is global variable

    // Behaviour: startsEngine, stopEngine, turnRight, turnLeft
    // fields -> used to define attributes in a method

    public static void main(String[] args) {
    /*  Car benz = new Car();
        benz.startEngine(false);
        benz.stopEngine();

        System.out.println();

        Car bmw = new Car();
        bmw.startEngine(true);
        bmw.stopEngine();*/
    /*System.out.println(Calculator.add(2,4));
        System.out.println(Calculator.subtract(2,4));
        System.out.println(Calculator.multiply(2,4));
        System.out.println(Calculator.divide(3,9));*/

      /*Person george = new Person("George", 28);
        Person victoria = new Person("Victoria", 29);

        System.out.println(george.getName());
        System.out.println(victoria.getName());

        System.out.println(victoria.getAge());*/

        // For the person class we have written today write a method that
        // allows you to find a BMI of a particular person, using what you
        // have learned today. height should be in meters and the weight should be in kg
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a weight: ");
        double scannerWeight = scanner.nextDouble();
        System.out.print("Please enter a height: ");
        double scannerHeight = scanner.nextDouble();

        oopBMI person1 = new oopBMI(scannerWeight, scannerHeight);

        System.out.print("With a weight " + person1.getWeight() + " kg "
                + "and height " + person1.getHeight() + " cm, the BMI is " +
                Math.round(person1.ResultBMI()));*/
        // Create a new class called Rectangle and in that class,
        // define two properties of a rectangle which are the length
        // and breadth. Create a constructor to allow
        // instantiation of the rectangles at object creation and
        // also write methods to find the perimeter and area of the rectangle

/*        Rectangle calculate = new Rectangle(2, 4);

        System.out.println("Perimeter of rectangle is: " + calculate.perimeter());
        System.out.println("Area of rectangle is: " + calculate.area());*/
        // Write a method that takes an array of 5 Person as a parameter and then returns
        // the average of the array of Persons as its output
        Person[] people = new Person[]{
                new Person("George", 22),
                new Person("Fred", 18),
                new Person("David", 20),
        };
        //Persons persons = new Persons(people);
        //System.out.println("The average age of people is: " + persons.getAverageAge(people));
        System.out.println("The average age of people is: " + getAverageAge(people));
    }
        public static float getAverageAge(Person[] people) {
            float sum = 0;
            // for-each loop
            for (Person person : people) {
                // person == person[i]
                sum += person.getAge();
            }
            return sum / people.length;

/*        Ferrari ferrari = new Ferrari();
        ferrari.startEngine(true);*/

    }
}

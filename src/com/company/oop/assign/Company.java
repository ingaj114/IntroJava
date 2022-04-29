package com.company.oop.assign;

public class Company {

    //public static void main(String[] args) {
        private String CompanyName;
        private Employee[] employees;

    public Company(String companyName, Employee[] employees) {
        CompanyName = companyName;
        this.employees = employees;
    }
    public float getAveAge(Person[] employees) {
        float sum = 0;
        for (Person person : employees) {
            sum += person.getAge();
        }
        return sum / employees.length;
    }
//    Person[] people = new Person[]{
//                new Person("Luise", 25),
//                new Person("Signe", 27),
//                new Person("Cristine", 29),
//                new Person("Lele", 45),
//                new Person("Olaf", 39),
//        };

    // System.out.println("Average age of employees is " + Employee.getAveAge(people));
//    }
    public String getRandomEmployee() {
        int randomIndex = (int)(Math.random() * employees.length);
       // if (randomIndex >= employees.length) return getRandomEmployee();
        return employees[randomIndex].getName();
    }
}

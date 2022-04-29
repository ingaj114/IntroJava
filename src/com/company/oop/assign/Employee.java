package com.company.oop.assign;

public class Employee extends Person {

    private long companyId;
    private String companyName;

    public Employee(String name, int age, long companyId, String companyName) {
        super(name, age);
        this.companyId = companyId;
        this.companyName = companyName;
    }


}

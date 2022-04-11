package com.company.oop;

public class Rectangle {
    double length;
    double breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double perimeter() {
        return (length + breadth) * 2;
    }
    public double area() {
        return length * breadth;
    }
}

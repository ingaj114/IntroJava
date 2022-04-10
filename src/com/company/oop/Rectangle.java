package com.company.oop;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
    public double perimeter() {
        return (length + breadth) * 2;
    }
    public double area() {
        return length * breadth;
    }
/*    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }*/
}


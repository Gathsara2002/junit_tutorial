package com.learning.test_driven_architecture;

public class Shape {

    public double areaOfSquare(double length) {
        return length * length;
    }

    public double areaOfCircle(double radius) {
        return Math.round(Math.PI * radius * radius);
    }
}

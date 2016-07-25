package com.tovazhnianskyi.volodymyr;

public class Circle implements IShape {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcSquare() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }
}

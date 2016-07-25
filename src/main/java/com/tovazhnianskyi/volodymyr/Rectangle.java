package com.tovazhnianskyi.volodymyr;

public class Rectangle implements IShape  {
    private double lineA = 1.0;
    private double lineB = 2.0;

    public Rectangle(double lineA, double lineB) {
        this.lineA = lineA;
        this.lineB = lineB;
    }

    public double calcSquare() {
        return lineA * lineB;
    }
}

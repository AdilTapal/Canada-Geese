package code.app;

import android.graphics.drawable.shapes.Shape;

public class Triangle extends Shape {
    private double radius;

    public Triangle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
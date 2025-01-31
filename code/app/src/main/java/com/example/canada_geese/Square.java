
package com.example.canada_geese;

import android.graphics.drawable.shapes.Shape;

// Square class that extends Shape
public class Square extends Shape {
    private double side;

    // Constructor to initialize the side length of the square
    public Square(double side) {
        this.side = side;
    }

    // Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }

    // Implementation of the area method
    @Override
    public double area() {
        return side * side;  // Area of a square is side^2
    }

    // Implementation of the perimeter method
    @Override
    public double perimeter() {
        return 4 * side;  // Perimeter of a square is 4 * side
    }
}

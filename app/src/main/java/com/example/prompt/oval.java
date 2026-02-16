package com.example.prompt;

public class oval extends Shape {

    int radiusX;   // horizontal radius
    int radiusY;   // vertical radius

    // Constructor
    public oval(int x, int y, int radiusX) {
        super(x, y);
        this.radiusX = radiusX;
    }

    // Optional: method to calculate area
    public double getArea() {
        return Math.PI * radiusX * radiusY;
    }

    @Override
    public void draw() {

    }
}

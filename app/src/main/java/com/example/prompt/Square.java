package com.example.prompt;

public class Square extends Shape {

    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("drawing square at (" + x + "," + y + ") with side length " + sideLength);
    }
}

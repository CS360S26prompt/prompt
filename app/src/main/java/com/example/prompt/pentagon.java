package com.example.prompt;

public class Pentagon extends Shape {

    private int sideLength;

    public Pentagon(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("drawing pentagon at (" + x + "," + y + ") with side length " + sideLength);
    }
}

package com.example.prompt;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public void draw() {
        System.out.println("drawing rectangle at (" + x + "," + y + ") with width " + width + " and height " + height);
    }
}

package com.example.prompt;

public abstract class Shape {

    protected int x;
    protected int y;
    String color = "black";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}

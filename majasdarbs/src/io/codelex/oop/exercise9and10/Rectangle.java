package io.codelex.oop.exercise9and10;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

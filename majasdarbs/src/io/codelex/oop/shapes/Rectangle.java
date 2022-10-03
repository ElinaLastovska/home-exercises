package io.codelex.oop.shapes;

public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return (width * 2) + (height * 2);
    }
}

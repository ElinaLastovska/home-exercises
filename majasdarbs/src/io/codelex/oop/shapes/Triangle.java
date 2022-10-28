package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private final int width;
    private final int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (height * width) / 2;
    }

    @Override
    public int getPerimeter() {
        return width + height + height;
    }
}

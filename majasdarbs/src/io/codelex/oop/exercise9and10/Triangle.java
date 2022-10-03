package io.codelex.oop.exercise9and10;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    private final double rightSide;
    private final double leftSide;

    public Triangle(double base, double height, double rightSide, double leftSide) {
        this.base = base;
        this.height = height;
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return base + rightSide + leftSide;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getLeftSide() {
        return leftSide;
    }
}

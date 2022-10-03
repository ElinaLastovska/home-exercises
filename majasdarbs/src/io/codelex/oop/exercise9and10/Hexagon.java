package io.codelex.oop.exercise9and10;

public class Hexagon extends Shape {

    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
    }

    @Override
    public double getPerimeter() {
        return side * 6;
    }

    public double getSide() {
        return side;
    }
}

package io.codelex.oop.exercise9and10;

public class Qube extends ThreeDShape {
    private final double side;


    public Qube(double side) {
        this.side = side;

    }

    @Override
    public double getArea() {
        return 6 * (side * side);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    public double getSide() {
        return side;
    }
}

package io.codelex.oop.exercise9and10;

public class Cone extends ThreeDShape {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSlantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius) + (Math.PI * radius * getSlantHeight());
    }

    @Override
    public double getPerimeter() {
        return (2 * radius) * 3.14;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

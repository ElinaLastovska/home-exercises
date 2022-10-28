package io.codelex.oop.shapes;

public class ShappesTests {
    public static void main(String[] args) {

        Triangle a = new Triangle(3, 2, 5);
        Rectangle b = new Rectangle(4, 2, 3);


        System.out.println("This rectangle have " + b.getNumSides() + " sides");
        System.out.println("Area is " + b.getArea());
        System.out.println("Perimeter is " + b.getPerimeter());

        System.out.println("This triangle have " + a.getNumSides() + " sides");
        System.out.println("Area is " + a.getArea());
        System.out.println("Perimeter is " + a.getPerimeter());

    }
}

package io.codelex.oop.exercise9and10;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle a = new Rectangle(2, 5);
        System.out.println("Rectangle area: " + a.getArea());
        System.out.println("Rectangle perimeter: " + a.getPerimeter());
        System.out.println();
        Triangle b = new Triangle(5, 3, 6, 2);
        System.out.println("Triangle area: " + b.getArea());
        System.out.println("Triangle perimeter: " + b.getPerimeter());
        System.out.println();
        Hexagon c = new Hexagon(3);
        System.out.println("Hexagon area: " + c.getArea());
        System.out.println("Hexagon perimeter: " + c.getPerimeter());
        System.out.println();
        Cone d = new Cone(4, 9);
        System.out.println("Cone area: " + d.getArea());
        System.out.println("Cone perimeter: " + d.getPerimeter());
        System.out.println("Cone volume: " + d.calculateVolume());
        System.out.println();
        Qube e = new Qube(3);
        System.out.println("Cube area: " + e.getArea());
        System.out.println("Cube perimeter: " + e.getPerimeter());
        System.out.println("Cube volume: " + e.calculateVolume());

    }
}

package io.codelex.classesandobjects.practice.swap;

import static io.codelex.classesandobjects.practice.swap.Point.swapPoints;

public class SwapTest {

    public static void main(String[] args) {


        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);


        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");


    }
}

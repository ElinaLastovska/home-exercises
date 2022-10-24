package io.codelex.classesandobjects.practice.swap;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point a, Point b) {

        int pointX = a.x;
        int pointY = a.y;
        a.x = b.x;
        a.y = b.y;
        b.x = pointX;
        b.y = pointY;


    }
}

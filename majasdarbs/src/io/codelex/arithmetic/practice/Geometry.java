package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        BigDecimal b1 = new BigDecimal("2");
        BigDecimal b2 = new BigDecimal("3.14159265359");
        BigDecimal b3 = b1.multiply(b2);
        BigDecimal b4 = radius.multiply(b3);
        double circleAre = b4.doubleValue();
        return circleAre;
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        BigDecimal c1 = length.multiply(width);
        double rectangleArea = c1.doubleValue();
        return rectangleArea;
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        BigDecimal d1 = new BigDecimal("0.5");
        BigDecimal d2 = base.multiply(h);
        BigDecimal d3 = d1.multiply(d2);
        double areaTriangle = d3.doubleValue();
        return areaTriangle;
    }


}



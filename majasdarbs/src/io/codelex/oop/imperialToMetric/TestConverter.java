package io.codelex.oop.imperialToMetric;

import static io.codelex.oop.imperialToMetric.MeasurementConverter.convert;

public class TestConverter {
    public static void main(String[] args) {

        double i = 5;
        System.out.println(convert(i, ConversionType.INCHES_TO_CENTIMETERS));

    }
}

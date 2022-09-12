package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner numberIn = new Scanner(System.in);

        System.out.println("distance in meters:");
        double meters = numberIn.nextDouble();

        System.out.println("Hour:");
        double hr = numberIn.nextDouble();

        System.out.println("Minute:");
        double min = numberIn.nextDouble();

        System.out.println("Seconds:");
        double sec = numberIn.nextDouble();
        

        double metersToKm = meters / 1000;
        double metersToMiles = meters * 0.00062137;

        double fullTimeHr = hr + (min / 60) + (sec / 60 / 60);
        double fullTimeSec = (hr * 60 * 60) + (min * 60) + sec;


        System.out.println("Your speed in meters/second is " + (meters / fullTimeSec));
        System.out.println("Your speed in km/h is " + (metersToKm / fullTimeHr));
        System.out.println("Your speed in miles/h is " + (metersToMiles / fullTimeHr));


    }
}


package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        double weightInKg = 0;
        double heightInM = 0;

        Scanner numberIn = new Scanner(System.in);
        System.out.println("Input weight in KG: ");
        weightInKg = numberIn.nextDouble();

        System.out.println("Input height in Meters: ");
        heightInM = numberIn.nextDouble();

        double weightInPounds = weightInKg * 2.20462262;
        double heightInInches = heightInM * 39.3700787;

        double inchesBMI = (weightInPounds * 703) / (heightInInches * 2);
        System.out.println(inchesBMI);

        if (inchesBMI < 18.5) {
            System.out.println("You are considered underweight. Your BMI is: " + inchesBMI);
        } else if (inchesBMI > 25) {

            System.out.println("You are considered overweight. Your BMI is: " + inchesBMI);
        } else {
            System.out.println("Your BMI is: " + inchesBMI);
        }

    }
}

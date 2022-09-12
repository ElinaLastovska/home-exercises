package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise8 {

    static double basePay = 0;
    static double hr = 0;

    public static void main(String[] args) {


        Scanner numberIn = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {

            System.out.println("Hours and base pay for employ " + i);

            System.out.println("Input base pay");
            basePay = numberIn.nextDouble();

            System.out.println("Input worked hours");
            hr = numberIn.nextDouble();


            calculatePay();
        }


    }

    public static void calculatePay() {

        double hrOvertime = 0;
        double finalPay = 0;
        double payOverTime = finalPay * 1.5;

        if (basePay < 8.00 || hr > 60) {
            System.out.println("error");

        } else if (hr > 40) {
            hrOvertime = hr - 40;
            finalPay = (hrOvertime * payOverTime) + 40 * basePay;
            System.out.println("Workers salary is: $" + finalPay);

        } else if (hr <= 40) {
            finalPay = hr * basePay;
            System.out.println("Workers salary is: $" + finalPay);
        }

    }
}

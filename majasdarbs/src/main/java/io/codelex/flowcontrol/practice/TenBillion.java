package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        if ((n >= Long.MIN_VALUE) && (n <= Long.MAX_VALUE)) {

            if (n < 0) {
                n *= -1;
                System.out.println(n);
            }

            if (n == 10000000000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {

                int digits = 1;

                if (n > 100000000) {
                    digits = 9;
                } else if (n > 10000000) {
                    digits = 8;
                } else if (n > 1000000) {
                    digits = 7;
                } else if (n > 100000) {
                    digits = 6;
                } else if (n > 10000) {
                    digits = 5;
                } else if (n > 1000) {
                    digits = 4;
                } else if (n > 100) {
                    digits = 3;
                } else if (n > 10) {
                    digits = 2;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }


    }
}

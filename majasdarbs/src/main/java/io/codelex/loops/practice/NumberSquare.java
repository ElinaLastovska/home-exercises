package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");

        int minValue = scanner.nextInt();


        System.out.println("Enter Enter second number:");

        int maxValue = scanner.nextInt();


        for (int i = minValue; i <= maxValue; i++) {
            for (int j = i; j <= maxValue; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < i - minValue; k++) {
                System.out.print(minValue + k);
            }
            System.out.println();
        }


    }
}

//min is less than or equal to max.
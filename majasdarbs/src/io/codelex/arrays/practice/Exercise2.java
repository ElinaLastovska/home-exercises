package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int sum = 0;

        for (int i = minNumber; i <= maxNumber; i++) {
            sum = i + i;
        }

        System.out.println("The sum is " + sum);
    }
}

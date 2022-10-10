package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {


        Scanner numberIn = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = numberIn.nextInt();

        if (number % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }

        System.out.println("Bye!");
    }
}

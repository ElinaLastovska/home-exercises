package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner numberIn = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int number1 = numberIn.nextInt();
        int number2 = numberIn.nextInt();

        System.out.println(number1 == 15 || number2 == 15 || number2 + number1 == 15 || number1 - number2 == 15);


    }
}

// System.out.println(number1 == 15 || number2 == 15 || number2 + number1 == 15 || number1 - number2 == 15);
package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("write number from 1 to 100");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {


            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 20 == 0) {
                System.out.println();
            }


        }

    }
}

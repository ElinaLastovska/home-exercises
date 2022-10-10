package io.codelex.exeptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            int numerator = 0;
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();

                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);

            } catch (InputMismatchException ime) {
                String input = scanner.nextLine();
                if (input.startsWith("q") || input.startsWith("Q")) {
                    System.out.println("worked");
                    break;
                }
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");

            } catch (ArithmeticException ae) {
                System.out.println("You can't divide " + numerator + " by 0");
                System.out.println("Please try again.");
            }
        }

    }
}
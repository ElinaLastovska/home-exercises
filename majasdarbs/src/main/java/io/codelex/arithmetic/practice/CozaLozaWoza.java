package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {


        int number = 1;

        while (number <= 110) {
            boolean test = false;
            if (number % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (number % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (number % 7 == 0) {
                System.out.print("woza");
                test = true;
            }
            if (!test) {
                System.out.print(number);
            }
            System.out.print(" ");
            if (number % 11 == 0) {
                System.out.println();
            }
            number++;
        }

    }
}

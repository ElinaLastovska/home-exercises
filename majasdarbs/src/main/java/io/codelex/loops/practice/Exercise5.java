package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        final int totalLength = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");

        String firstWord = scanner.nextLine();

        System.out.println("Enter second word word:");

        String secondWord = scanner.nextLine();

        String both = firstWord + secondWord;

        int length = totalLength - both.length();

        StringBuilder dot = new StringBuilder(".");

        if (both.length() < 30) {

            dot.append(String.valueOf(dot).repeat(Math.max(0, length)));
            System.out.print(firstWord + dot + secondWord);

        } else {
            System.out.println("not in a range");
        }
    }
}

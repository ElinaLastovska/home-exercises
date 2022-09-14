package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");

        String firstWord = scanner.nextLine();

        System.out.println("Enter Enter second word word:");

        String secondWord = scanner.nextLine();

        String both = firstWord + secondWord;

        int leng = 30 - both.length();


        StringBuilder punkt = new StringBuilder(".");
        
        if (both.length() < 30) {


            punkt.append(String.valueOf(punkt).repeat(Math.max(0, leng)));
            System.out.print(firstWord + punkt + secondWord);


        } else {
            System.out.println("not in a range");
        }
    }
}

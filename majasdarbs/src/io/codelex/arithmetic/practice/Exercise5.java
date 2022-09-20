package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int min = 50;
        int max = 100;

        int number = (int) Math.floor(Math.random() * (max - min + 1) + min);

        Scanner numberIn = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int guess = numberIn.nextInt();


        if (number == guess) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (number < guess) {
            System.out.println("Sorry, you are too high.  I was thinking of " + number);
        } else {
            System.out.println("Sorry, you are too low.  I was thinking of " + number);
        }
    }
}

package io.codelex.loops.practice;

import java.util.Objects;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Piglet!");
        String scan = null;
        int points = 0;
        int getRandomValue;
        do {
            int min = 1;
            int max = 6;

            getRandomValue = (int) (Math.random() * (max - min)) + min;

            System.out.println("You rolled a " + getRandomValue + "!");


            if (getRandomValue > 1) {

                System.out.print("Roll again?");
                scan = scanner.next();


            } else if (getRandomValue == 1) {
                System.out.println("Maybe next time!");


            }


            points++;
        } while (Objects.equals(scan, "yes") && getRandomValue > 1);
        System.out.println("Maybe next time. You earned " + points + "points");
    }
}



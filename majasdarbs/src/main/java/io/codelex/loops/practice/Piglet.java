package io.codelex.loops.practice;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        String scan = null;
        int points = 0;
        int randomValue;
        do {
            int min = 1;
            int max = 6;

            Random random = new Random();
            randomValue = random.nextInt(max) + min;

            System.out.println("You rolled a " + randomValue + "!");

            if (randomValue > 1) {

                System.out.print("Roll again? ");
                scan = scanner.next().toLowerCase();

            } else if (randomValue == 1) {
                System.out.println("Maybe next time!");

            }
            points++;
        } while (Objects.equals(scan, "yes") && randomValue > 1);
        System.out.println("Maybe next time. You earned " + points + " points");
    }
}



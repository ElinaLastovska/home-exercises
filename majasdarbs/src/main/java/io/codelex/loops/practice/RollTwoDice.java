package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        int values = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired sum: ");
        int sum = scanner.nextInt();

        int randomValue1;
        int randomValue2;

        do {

            if (sum > 1 && sum <= 12) {

                randomValue1 = rollDice();
                randomValue2 = rollDice();
                
                values = randomValue1 + randomValue2;
                System.out.println("You rolled a " + randomValue1 + " and " + randomValue2 + " = " + values);


            } else {
                System.out.println("Please enter values 2 to 12");
                break;
            }
        } while (values != sum);
    }

    static int rollDice() {
        int min = 1;
        int max = 6;
        Random random = new Random();
        return random.nextInt(max) + min;

    }
}

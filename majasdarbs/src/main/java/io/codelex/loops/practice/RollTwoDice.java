package io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        int values = 0;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired sum: ");
        sum = scanner.nextInt();


        do {

            if (sum > 1 && sum <= 12) {

                int min = 1;
                int max = 6;

                int getRandomValue = (int) (Math.random() * (max - min)) + min;
                int getRandomValue2 = (int) (Math.random() * (max - min)) + min;

                values = getRandomValue + getRandomValue2;
                System.out.println("You rolled a " + getRandomValue + " and " + getRandomValue2 + " = " + values);


            } else {
                System.out.println("Please enter values 2 to 12");
                break;
            }
        } while (values != sum);
    }
}

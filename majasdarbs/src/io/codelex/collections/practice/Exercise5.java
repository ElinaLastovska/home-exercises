package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Write number");
        int number = scan.nextInt();

        int result = number;

        while (result != 1 && result != 4) {
            result = isHappyNumber(result);
        }
        
        if (result == 1) {
            System.out.println(number + " is a happy number");

        } else if (result == 4) {
            System.out.println(number + " is not a happy number");
        }
    }

    public static int isHappyNumber(int num) {
        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}

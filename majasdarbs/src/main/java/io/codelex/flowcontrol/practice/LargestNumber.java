package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("largest number is 1st");

        } else if (num3 > num2) {
            System.out.println("largest number is 3rd");

        } else {
            System.out.println("largest number is 2nd");
        }
    }

}

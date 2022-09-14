package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input an day number: ");

        int dayNumber = in.nextInt();


        if (dayNumber > 7 || dayNumber <= 0) {
            System.out.println(" Not a valid day");
        } else {

            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
            }

        }


    }
}

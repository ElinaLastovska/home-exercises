package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {


        Scanner numberIn = new Scanner(System.in);

        System.out.println("Enter minutes:");

        int min = numberIn.nextInt();
        double minInDay = 1440;
        double minInYear = 525948;

        System.out.println(min + " minutes is " + (min / minInYear) + " years");
        System.out.println(min + " minutes is " + (min / minInDay) + " days");

    }
}

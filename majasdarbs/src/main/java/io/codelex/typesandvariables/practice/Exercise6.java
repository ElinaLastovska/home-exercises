package io.codelex.typesandvariables.practice;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {


        Scanner numberIn = new Scanner(System.in);

        System.out.println("Enter single digit number:");


        int number= numberIn.nextInt();
        System.out.println("Enter single digit number:");


        int number1= numberIn.nextInt();

        // Output input by user
        System.out.println("Sum: " + (number + number1));

    }
}

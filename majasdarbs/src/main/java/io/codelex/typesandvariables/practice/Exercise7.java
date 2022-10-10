package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");

        Scanner textInput = new Scanner(System.in);

        String text = textInput.nextLine();
        int textLenght = text.length();
        int count = 0;

        for (int i = 0; i < textLenght; i++) {

            if (Character.isUpperCase(text.charAt(i))) {

                count++;
            }
        }
        System.out.println("Number of upper case letters: " + count);


    }
}

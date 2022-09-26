package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class HangMan {


    public static <string> void main(String[] args) {


        String[] words = {
                "agony", "arena", "reliable", "word", "brain",
                "glasses", "defendant", "activity", "property"
        };

        StringBuilder misses = new StringBuilder();

        Random rand = new Random();
        String randomWord = words[rand.nextInt(words.length)];

        //   System.out.println(randomWord);


        int tries = 3;
        int errors = 0;
        Scanner scan = new Scanner(System.in);


        char[] playerGuess = new char[randomWord.length()];
        for (int i = 0; i < playerGuess.length; i++) {
            playerGuess[i] = '_';

        }


        while ((tries > errors)) {

            System.out.println("Word is " + randomWord.length() + " letters long");
            System.out.print("Guess: ");

            char searchLetter = scan.next().charAt(0);


            boolean isGoessCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                char l = randomWord.charAt(i);

                if (l == searchLetter) {
                    playerGuess[i] = l;
                    isGoessCorrect = true;
                }
            }

            if (!isGoessCorrect) {
                misses.append(searchLetter);
                errors++;
            }

            System.out.print("Word:  ");
            for (int i = 0; i < playerGuess.length; i++) {
                System.out.print(playerGuess[i]);
            }
            System.out.println();
            System.out.println("Misses: " + misses);
            System.out.println();
            System.out.println("You have left " + (tries - errors) + " tries");
            if (errors == tries) {
                System.out.println("Game over! Word was: " + randomWord);
            }

            System.out.println("======================");


        }

    }

}


package io.codelex.enums.practice.exercise2;

import java.util.Scanner;

import static io.codelex.enums.practice.exercise2.Sps.*;

public class SpsTest {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Let us begin...");
        System.out.println("Scissor-Paper-Stone");
        Scanner scan = new Scanner(System.in);
        double numberOfGames = 0;
        double computerWon = 0;
        double youWon = 0;
        while (true) {
            try {
                System.out.println("Your turn! (Enter: scissor, paper, stone or q to quit):");
                Sps value = Sps.valueOf(scan.nextLine().toUpperCase());
                if (value == Q) {
                    System.out.println("Number of trials: " + numberOfGames);
                    System.out.println("Computer wont: " + computerWon + " " + getProcentige(numberOfGames, computerWon) + "%");
                    System.out.println("You wont: " + youWon + " " + getProcentige(numberOfGames, youWon) + "%");
                    System.out.println("Bye!");
                    break;
                }
                numberOfGames++;
                System.out.println("You chose " + value);
                System.out.println("Computers turn:");
                Sps computersTurn = randomSps();
                System.out.println(computersTurn);

                if (value == computersTurn) {
                    System.out.println("Its a tie!");
                } else if (value == PAPER && computersTurn == STONE) {
                    System.out.println("You won!");
                    youWon++;
                } else if (value == STONE && computersTurn == SCISSOR) {
                    System.out.println("You won!");
                    youWon++;
                } else if (value == SCISSOR && computersTurn == PAPER) {
                    System.out.println("You won!");
                    youWon++;
                } else {
                    System.out.println("You lose!");
                    computerWon++;
                }
            } catch (IllegalArgumentException ime) {
                System.out.println("Invalid input, try again...");
            }
        }
    }

    public static double getProcentige(double totalValue, double value) {
        return (value / totalValue) * 100;
    }
}

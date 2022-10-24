package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];
    static boolean game = true;
    public static void main(String[] args) {

        initBoard();

        while (game) {
            displayBoard();
            game(board, "Player1");
            displayBoard();
            game(board, "Player2");
        }
    }

    private static void initBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    private static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    private static Boolean checkWinner(char[][] board) {
        boolean check = (board[0][0] != ' ') && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2]);
        if ((board[1][0] != ' ') && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])||
                ((board[2][0] != ' ') && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))||
                ((board[0][0] != ' ') && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))||
                ((board[0][1] != ' ') && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))||
                ((board[0][2] != ' ') && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))||
                ((board[0][0] != ' ') && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))||
                ((board[2][0] != ' ') && (board[2][0] == board[1][1]) && (board[1][1] == board[0][2]))
        ) {
            check = true;
        }
        return check;
    }

    private static Boolean checkTie(char[][] board) {

        return (board[0][0] != ' ') && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])
                && (board[0][2] == board[1][0]) && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])
                && (board[1][2] == board[2][0]) && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2]);

    }
    public static void game(char[][] board, String user) {

        char symbol = 'x';

        if (user.equals("Player1")) {
            symbol = 'X';
        } else if (user.equals("Player2")) {
            symbol = 'O';
        }

        Scanner keyboard = new Scanner(System.in);

        System.out.println("choose row: ");
        int row = keyboard.nextInt();
        System.out.println("choose column: ");
        int col = keyboard.nextInt();

        if (row < 0 || col < 0 || row >= 3 || col >= 3) {
            System.out.println("This move is not allowed! Second players turn! :");
        } else if (board[row][col] != ' ') {
            System.out.println("Someone has already made a move at this position! Second players turn! :");
        } else {
            board[row][col] = symbol;
        }
        if (checkTie(board)) {
            System.out.println("Its a tie!");
            game = false;
        }
        if (checkWinner(board)) {
            System.out.println("victory!");
            game = false;
        }
    }
}

package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;
        int b = 1;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.print("Input number : ");
        i = in.nextInt();


        for (int j = 1; j <= n; j++) {
            b = b * i;

            System.out.println(b);
        }
    }
}



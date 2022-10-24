package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        int max = 100;
        int min = 1;

        Random rClass = new Random();

        System.out.print("Array 1: ");
        for (int i = 0; i < 10; i++) {

            myArray[i] = rClass.nextInt(max - min) + min;
            System.out.print(myArray[i] + " ");
        }
        myArray[myArray.length-2] = -7;
        System.out.println();

        System.out.print("Array 2: ");
        int[] myArrayCopy = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {

            myArrayCopy[i] = myArray[i];

            System.out.print(myArrayCopy[i] + " ");
        }

    }

}

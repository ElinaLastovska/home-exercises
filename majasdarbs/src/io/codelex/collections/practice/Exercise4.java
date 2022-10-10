package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> myList = new HashSet<>();

        boolean value = true;
        while (value) {
            System.out.println("Write name");
            String name = scan.nextLine();
            if (!Objects.equals(name, "")) {
                myList.add(name);

            } else {
                System.out.println(myList);
                value = false;
            }

        }
    }
}

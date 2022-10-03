package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {

        LocalDate launchDate = LocalDate.of(2022, 9, 1);

        int daysToAdd = 14;
        LocalDate copy = launchDate;

        while (launchDate.getMonthValue() == copy.getMonthValue()) {
            copy = launchDate.plusDays(daysToAdd);
            daysToAdd += 14;
            if (launchDate.getMonthValue() == copy.getMonthValue()) {
                System.out.println("You have to do server update at: " + copy);
            }
        }
    }
}

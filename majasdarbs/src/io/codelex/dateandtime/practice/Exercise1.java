package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise1 {

    public static void main(String[] args) {

        LocalDate date;
        int add = 0;
        int days = 0;
        int hr;

        LocalDate startDate = LocalDate.of(2022, 1, 1);

        LocalDate endDate = LocalDate.of(2022, 1, 4);

        long noOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);


        for (int i = 0; i <= noOfDaysBetween; i++) {
            date = startDate.plusDays(add);
            add++;
            if (!(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                days++;
            }
        }

        hr = days * 8;
        System.out.println("Employee has worked: " + hr + " hours");
    }
}

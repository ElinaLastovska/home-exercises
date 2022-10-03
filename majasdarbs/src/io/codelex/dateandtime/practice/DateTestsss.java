package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Arrays;

import static io.codelex.dateandtime.practice.DateTimeExercise.*;

public class DateTestsss {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.now();
        System.out.println(findNextFriday13th(startDate));

        System.out.println(Arrays.toString(getTwoLocalDates()));

        System.out.println(createNewYearsEve2017());
    }
}

package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.ArrayList;

public class DatePeriod {

    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public static ArrayList<LocalDate> dateArray(DatePeriod a, DatePeriod b) {
        ArrayList<LocalDate> dateList = new ArrayList<>();
        int add = 0;
        for (int i = b.start.getDayOfMonth(); i <= a.end.getDayOfMonth(); i++) {
            LocalDate period = b.start.plusDays(add);
            add++;
            dateList.add(period);

        }
        return dateList;
    }

    public static void intersection(DatePeriod a, DatePeriod b) {
        if (a.start.isAfter(b.end) || (b.start.isAfter(a.end))) {
            System.out.println("dates have no overlap");
        } else if (a.start.isBefore(b.start) && b.end.isBefore(a.end)) {
            System.out.println(b);
        } else if (b.start.isBefore(a.start) && a.end.isBefore(b.end)) {
            System.out.println(a);
        } else if (a.start.isBefore(b.start) && a.end.isBefore(b.end)) {
            System.out.println(dateArray(a, b));
        } else if (b.start.isBefore(a.start) && b.end.isBefore(a.end)) {
            System.out.println(dateArray(b, a));
        }
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

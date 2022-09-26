package io.codelex.classesandobjects.practice.date;

public class DateTest {

    public static void main(String[] args) {

        Date yesterday = new Date();
        yesterday.setDay(22);
        yesterday.setMonth(12);
        yesterday.setYear(1908);

        System.out.println(yesterday.getMonth() + "/" + yesterday.getDay() + "/" + yesterday.getYear());


        Date today = new Date(11, 32, 2020);
        today.displayDate();

    }
}

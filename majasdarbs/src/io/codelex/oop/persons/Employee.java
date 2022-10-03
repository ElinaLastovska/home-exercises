package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Person {

    String position;
    LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        return Math.toIntExact(ChronoUnit.YEARS.between(startedWorking, LocalDate.now()));
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getPosition() + " (" + getWorkExperience() + " years)";
    }

}

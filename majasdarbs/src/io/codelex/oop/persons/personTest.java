package io.codelex.oop.persons;

import java.time.LocalDate;

public class personTest {
    public static void main(String[] args) {

        Employee a = new Employee("Vards", "Uvzavrds", "id", 22, "Worker", LocalDate.of(2020, 1, 1));

        System.out.println(a.getInfo());

        Customer b = new Customer("Name", "Second name", "12356SASS", 32, "PircejaId2", 2333);
        System.out.println(b.getInfo());


    }
}

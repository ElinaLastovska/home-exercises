package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {

        Student a = new Student("Kads", "Kadu", "kautkur", 1, 963);
        Employee b = new Employee("Vel kads", "ar kadu", "vel kautkur", 1, "Kaut kas");

        a.display();
        b.display();

    }
}

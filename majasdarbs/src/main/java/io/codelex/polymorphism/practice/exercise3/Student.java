package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    Double gpa;


    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }


    @Override
    public void display() {
        System.out.println("Student: Name- " + firstName + ", last name- " + lastName + ", address- " + address + ", ID- " + id + ", GPA- " + gpa);
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

}

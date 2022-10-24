package io.codelex.classesandobjects.practice.KD;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Author {
    //Elina Lastovska
    public static final String BOOKS_IN_THE_WORLD = "129864880";
    public static
    String firstName;
    static LocalDate now = LocalDate.now();
    String lastName;
    LocalDate dateOfBirth;
    List<String> authorsBook = new ArrayList<>();

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        Author.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

    }

    public static int getAge(LocalDate birthDate) {
        return Period.between(birthDate, now).getYears();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", authorsBook=" + authorsBook +
                '}';
    }

    public void addBook(String book) {
        authorsBook.add(book);

    }

    public boolean hasWrittenBook(String book) {
        return authorsBook.contains(book);
    }

    public void printAllInfo() {
        System.out.println("Author" + getFullName());
        System.out.println("His age is " + Author.getAge(dateOfBirth) + " at the moment");
        System.out.println("He has written " + authorsBook.size() + " books");

    }
}

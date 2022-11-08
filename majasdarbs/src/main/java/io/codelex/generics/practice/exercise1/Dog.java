package io.codelex.generics.practice.exercise1;

public class Dog extends Animals {
    String breed;

    public Dog(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}

package io.codelex.generics.practice;

public abstract class Animals {
    String name;
    Integer age;

    public Animals(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "AbstractClassAnimals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

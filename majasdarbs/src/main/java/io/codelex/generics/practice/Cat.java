package io.codelex.generics.practice;

public class Cat extends Animals {
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
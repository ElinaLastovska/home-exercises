package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        al.add(0, "TEXT");
        al.add(1, "TEXT2");
        Dog a = new Dog("Snowflake", 33, "pitbull");
        Dog b = new Dog("Mushroom", 5, "pug");
        Cat c = new Cat("Mushi", 11);
        List<Animals> aa = new ArrayList<>();
        aa.add(0, a);
        aa.add(1, b);
        aa.add(2, c);
        System.out.println(aa.get(2));
        System.out.println(aa.get(0));

    }
}

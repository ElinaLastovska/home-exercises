package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {

        List<String> newList = new ArrayList<>();
        newList.add("One");
        newList.add("Two");
        newList.add("Three");
        newList.add("Four");
        newList.add("Five");
        newList.add("Six");
        newList.add("Seven");
        newList.add("Eight");
        newList.add("Nine");
        newList.add("Ten");
        System.out.println("New list with 10 String values " + newList);

        newList.add(4, "New value");
        System.out.println("New value at 5th position " + newList);

        newList.set(newList.size() - 1, "New at last position");
        System.out.println("New value at last position " + newList);
        newList.sort(Comparator.naturalOrder());
        System.out.println("Alphabetical order " + newList);

        if (newList.contains("Foobar")) {
            System.out.println("List contains Foobar");
        } else {
            System.out.println("List dont contain Foobar");
        }
        System.out.println("Printing elements with loop ");
        for (String a : newList) {
            System.out.print(a + " ");
        }

    }

}

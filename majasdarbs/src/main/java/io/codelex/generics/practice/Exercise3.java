package io.codelex.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        System.out.println("Saraksts -");
        add("Dog", list);
        add("Cat", list);
        list.forEach(System.out::println);
        System.out.println("==============");

        System.out.println("Objektu araksts -");
        List<Object> objectList = new ArrayList<>();
        add("Bed", objectList);
        add("Leash", objectList);
        objectList.forEach(System.out::println);
        System.out.println("==============");

        System.out.println("Objektu saraksts kam pievienots saraksts ar - addAllX metodi");
        addAllX(list, objectList);
        objectList.forEach(System.out::println);
        System.out.println("==============");


//        System.out.println("Objektu araksts kam pievienots saraksts ar - addAllY metodi");
//        addAllY(list, objectList);
//        objectList.forEach(System.out::println);
//        System.out.println("==============");
        System.out.println("Objektu araksts kam pievienots saraksts ar - addAllY metodi. (Kas strādā tikai ja abi saraksti satur vienāda tipa vērtības)");
        List<String> list2 = new ArrayList<>();
        add("Wolf", list);
        add("Lion", list);
        addAllY(list, list2);

        list2.forEach(System.out::println);


    }

    public static <T> void add(T value, List<T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }
}

/*
 Explain why we obtain such an error.
 * lietojot "? wildcard" sarakstā -  nav iespējams tajā rakstīt datus, jo nav zināms, kāda tipa objektus satur konkrētais saraksts. un kādu tipu metodei jāatgriež.



 * */
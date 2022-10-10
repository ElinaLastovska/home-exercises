package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List<String> myList = new ArrayList<>();

        Collections.addAll(myList, array);
        System.out.println("My list");
        System.out.println(myList);
        HashSet<String> myHashSet = new HashSet<>(myList);
        System.out.println("My hashset");
        System.out.println(myHashSet);
        System.out.println("My hashMap");
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Audi", "Germany");
        myHashMap.put("BMW", "Germany");
        myHashMap.put("Mercedes", "Germany");
        myHashMap.put("VolksWagen", "Germany");
        myHashMap.put("Tesla", "USA");
        System.out.println(myHashMap);
    }
}

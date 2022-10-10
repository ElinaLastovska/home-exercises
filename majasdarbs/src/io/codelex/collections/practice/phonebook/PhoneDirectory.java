package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> tree_map = new TreeMap<String, String>();
    private PhoneEntry data;

    public PhoneDirectory() {
        this.tree_map = new TreeMap<>();
    }


    public void putNumber(PhoneEntry data) {
        if (data.getName() == null || data.number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        } else {
            tree_map.put(data.getName(), data.getNumber());

        }
    }

    public <V, K> void printDirectory() {
        for (Map.Entry<String, String> entry : tree_map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
    }
    
    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "tree_map=" + tree_map +
                ", data=" + data +
                '}';
    }
}

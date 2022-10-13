package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    static int quantity;

    public static void setQuantity(int quantity) {
        Food.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "quantity=" + quantity +
                '}';
    }
}

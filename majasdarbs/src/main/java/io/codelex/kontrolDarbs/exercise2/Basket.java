package io.codelex.kontrolDarbs.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> basket = new ArrayList<>(10);
    private int numberOfItems;

    public Basket() {
    }

    public void addToBasket(T item) {
        if (numberOfItems == 10) {
            throw new BasketFullException("Basket is full!");
        }

        basket.add(item);
        numberOfItems = numberOfItems + 1;
    }

    public void removeFromBasket(T item) {
        if (numberOfItems == 0) {
            throw new BasketEmptyException("Basket is empty!");
        }
        basket.remove(item);
        numberOfItems = numberOfItems - 1;
    }


    public Integer getNumberOfItems() {
        return numberOfItems;
    }


    @Override
    public String toString() {

        return "Basket contains: " + numberOfItems + " " + basket.get(0);
    }
}

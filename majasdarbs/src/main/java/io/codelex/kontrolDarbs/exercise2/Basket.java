package io.codelex.kontrolDarbs.exercise2;

public class Basket<T> {
    private final T item;

    private int numberOfItems;


    public Basket(T item) {
        this.item = item;
    }


    public void addToBasket(T item) {
        if (numberOfItems == 10) {
            throw new BasketFullException("Basket is full!");
        }
        numberOfItems = numberOfItems + 1;
    }

    public void removeFromBasket(T item) {
        if (numberOfItems == 0) {
            throw new BasketEmptyException("Basket is empty!");
        }
        numberOfItems = numberOfItems - 1;
    }


    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "numberOfItems= " + numberOfItems +
                '}';
    }
}

package io.codelex.classesandobjects.practice.product;

public class Product {

    public String name;
    public double priceAtStart;
    public int amountAtStart;

    public Product(String newName, double newPrice, int newAmount) {
        name = newName;
        priceAtStart = newPrice;
        amountAtStart = newAmount;

    }


    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + " Eur, amount " + amountAtStart + " units");
    }

}

package io.codelex.kontrolDarbs.exercise2;

public class BasketTest {
    public static void main(String[] args) {
        Mushroom a = new Mushroom();
        Apple b = new Apple();

        Basket<Object> c = new Basket<>(b);
        c.removeFromBasket(b);
        System.out.println(c);
    }

}

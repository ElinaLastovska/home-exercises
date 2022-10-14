package io.codelex.kontrolDarbs.exercise1;

public class CardTest {
    public static void main(String[] args) {

        CreditCard a = new CreditCard(32423, "Kads Cits", "036", 1200);
        DebitCard b = new DebitCard(34234, "Vel Cits", "001", 222);
        System.out.println(a);
        System.out.println(b);

        a.addMoney(233);
        System.out.println(a);
        a.addMoney(112000);
        System.out.println(a);
        a.addMoney(456);

    }
}

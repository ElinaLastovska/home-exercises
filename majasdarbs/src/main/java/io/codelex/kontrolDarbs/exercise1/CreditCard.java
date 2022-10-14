package io.codelex.kontrolDarbs.exercise1;

public class CreditCard extends Card {

    public CreditCard(int number, String owner, String codeCCV, double balance) {
        super(number, owner, codeCCV, balance);
    }

    public void addMoney(int amount) {
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
        this.balance = balance + amount;
    }
}

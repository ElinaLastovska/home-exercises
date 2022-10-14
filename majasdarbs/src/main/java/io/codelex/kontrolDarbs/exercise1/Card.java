package io.codelex.kontrolDarbs.exercise1;

public abstract class Card {
    int number;
    String owner;
    String codeCCV;
    double balance;

    public Card(int number, String owner, String codeCCV, double balance) {
        this.number = number;
        this.owner = owner;
        this.codeCCV = codeCCV;
        this.balance = balance;
    }


    public void addMoney(int amount) {
        this.balance = balance + amount;
    }

    public void drawMoney(int amount) {

        if (amount > balance) {
            throw new NotEnoughFundsException("its not possible to take out the amount you are requesting");
        }
        this.balance = balance - amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCodeCCV() {
        return codeCCV;
    }

    public void setCodeCCV(String codeCCV) {
        this.codeCCV = codeCCV;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", codeCCV=" + codeCCV +
                ", balance=" + balance +
                '}';
    }
}

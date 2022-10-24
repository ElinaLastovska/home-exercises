package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final double deposit(double amount) {
        return balance + amount;
    }

    public final double withdraw(double amount) {
        return balance - amount;
    }

    @Override
    public String toString() {
        if (balance >= 0) {
            return name + ", $" + balance;
        }
        return name + ", -$" + balance;
    }
}

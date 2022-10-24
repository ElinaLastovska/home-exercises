package io.codelex.classesandobjects.practice.account;

public class AccountTest {

    public static void main(String[] args) {

        Account a = new Account("Barto's account", 100.00);
        Account b = new Account("Barto's account in Switzerland", 0);
        Account c = new Account("Matt's account ", 0);

        System.out.println("Initial state");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        transfer(a, b, 50.00);
        transfer(b, c, 25.00);

        System.out.println("Final state");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}

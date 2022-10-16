package io.codelex.kontrolDarbs.exercise1;

public class DebitCard extends Card {


    public DebitCard(int number, String owner, String codeCCV, double balance) {
        super(number, owner, codeCCV, balance);
    }

    public void drawMoney(int amount) {

        if (amount > balance) {
            throw new NotEnoughFundsException("its not possible to take out the amount you are requesting");
        }
        super.drawMoney(amount);

        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }

    }
}

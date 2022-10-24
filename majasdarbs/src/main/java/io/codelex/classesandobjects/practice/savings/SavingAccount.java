package io.codelex.classesandobjects.practice.savings;

public class SavingAccount {

    double rate;
    double balance;

    SavingAccount(double balance) {
        this.balance = balance;
    }


    public Double subtractingOfWithdrawal(double subtract) {
        return balance - subtract;
    }

    public Double addingAmountDeposit(double add) {
        return balance + add;
    }


    public Double addMonthlyInterestToBalance(double balance, double annualInterest, double months, double deposit) {
        return ((annualInterest / 100) * months + balance) + deposit;
    }

    public Double subtractMonthlyInterestToBalance(double balance, double annualInterest, double months, double withdraw) {
        return ((annualInterest / 100) * months + balance) - withdraw;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "rate=" + rate +
                ", balance=" + balance +
                '}';
    }
}

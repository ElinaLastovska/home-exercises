package io.codelex.classesandobjects.practice.savings;

import java.util.Scanner;

public class SavingsTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How much money is in the account?: ");
        double startBalance = scan.nextDouble();

        SavingAccount i = new SavingAccount(startBalance);

        System.out.println("Enter the annual interest rate: ");
        double annualInteresRate = scan.nextDouble();

        System.out.println("How long has the account been opened?: ");
        double months = scan.nextDouble();

        double j = 1;
        double deposit = 0;
        double withdraw = 0;
        while (months > j - 1) {
            System.out.println("Enter amount deposited for " + (int) j + " month: ");
            deposit = scan.nextDouble();
            i.addingAmountDeposit(deposit);

            System.out.println("Enter amount withdrawn for " + (int) j + " month: ");
            withdraw = scan.nextDouble();
            i.subtractingOfWithdrawal(withdraw);

            deposit = deposit + deposit;
            withdraw = withdraw + withdraw;

            j++;
        }
        System.out.println(i);
        System.out.println("Total deposited: " + deposit);
        System.out.println("Total withdrawn: " + withdraw);
        System.out.println("Ending balance: " + i.addMonthlyInterestToBalance(startBalance, annualInteresRate, months, deposit));
        System.out.println("Interest earned: " + i.subtractMonthlyInterestToBalance(startBalance, annualInteresRate, months, withdraw));

    }
}

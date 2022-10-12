package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double s) {
        totalSales += s;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nCommission: " + (totalSales / 100) * commissionRate;
        return result;

    }


    @Override
    public double pay() {
        double payment = super.pay() + (totalSales / 100) * commissionRate;
        commissionRate = 0;
        return payment;
    }


}

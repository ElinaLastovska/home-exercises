package io.codelex.classesandobjects.practice.fuelgauge;

public class GaugeTest {

    public static void main(String[] args) {


        FuelGauge fuel = new FuelGauge();
        Odometer odometer = new Odometer();

        fuel.setLiters(2);
        odometer.setEndKilometers(11);

        System.out.println("At start we have " + fuel.getLiters() + " liters. And " + odometer.getEndKilometers() + " kilometers");
        System.out.println();

        while (fuel.getLiters() > 0) {

            fuel.decrementFuel();
            odometer.incrementMileage();

            System.out.println("After one loop: " + fuel.getLiters() + " liters. And " + odometer.getEndKilometers() + " kilometers");
            System.out.println();
        }


    }


}

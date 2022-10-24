package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {


        Car car = getdata();

        car.fillUp(22, 32);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        if (car.gasHog()) {
            System.out.println("Car is not environmentally friendly!");
        } else if (car.economyCar()) {
            System.out.println("Car is economical!");
        }


    }


    private static Car getdata() {
        double startKilometers;
        double liters;
        double mileage;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        mileage = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();


        return new Car(startKilometers);

    }
}

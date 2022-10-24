package io.codelex.classesandobjects.practice.car;

public class Car {

    private final double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = startKilometers;
        this.liters = 0;

    }

    void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {

        return liters / ((endKilometers - startKilometers) / 100);

    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }


}

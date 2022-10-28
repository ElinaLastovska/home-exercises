package io.codelex.classesandobjects.practice.car;

public class Car {
    private static final double HIGH_FUEL_CONSUMPTION = 15.0;
    private static final double LOW_FUEL_CONSUMPTION = 5.0;
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
        return calculateConsumption() > HIGH_FUEL_CONSUMPTION;
    }

    public boolean economyCar() {
        return calculateConsumption() < LOW_FUEL_CONSUMPTION;
    }


}

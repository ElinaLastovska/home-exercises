package io.codelex.classesandobjects.practice.fuelgauge;

public class Odometer {

    public double endKilometers;

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public void incrementMileage() {

        this.endKilometers = getEndKilometers() + 1;
    }

    public void decreaseMileage() {

        this.endKilometers = getEndKilometers() + 1;
    }
}

package io.codelex.classesandobjects.practice.fuelgauge;

public class FuelGauge {

    public double liters;

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public void incrementFuel() {

        this.liters = getLiters() + 1;
    }

    public void decrementFuel() {

        this.liters = getLiters() - 1;
    }


}

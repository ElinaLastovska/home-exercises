package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    public static int numberSurveyed = 12467;
    public static double energyDrinkers = 0.14;
    public static double preferCitrus = 0.64;

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + numberSurveyed);
        System.out.println("Approximately " + calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println(calculatePreferCitris() + " of those " + "prefer citrus flavored energy drinks.");

    }

    public static double calculateEnergyDrinkers() {
        return Math.round(numberSurveyed * energyDrinkers);
    }

    public static double calculatePreferCitris() {
        return Math.round(calculateEnergyDrinkers() * preferCitrus);
    }
}

package io.codelex.polymorphism.practice.exercise1;

public class Honda implements Car, BoostCar {

    Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 9;
    }

    public void slowDown() {
        currentSpeed -= 9;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("RrrrrrrKrKrKrKK.Krr....");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}

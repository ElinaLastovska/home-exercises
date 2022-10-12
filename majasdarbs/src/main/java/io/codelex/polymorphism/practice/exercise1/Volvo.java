package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car {
    Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }


    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("BRrrrrr.....");
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}

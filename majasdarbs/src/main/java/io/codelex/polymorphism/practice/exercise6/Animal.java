package io.codelex.polymorphism.practice.exercise6;

import static io.codelex.polymorphism.practice.exercise6.Mammal.livingRegion;

public abstract class Animal {

    static String animalName;
    static Double animalWeight;
    static String animalType;
    Integer FoodEaten = 0;

    public static String getAnimalName() {
        return animalName;
    }

    public static void setAnimalName(String animalName) {
        Animal.animalName = animalName;
    }

    public static Double getAnimalWeight() {
        return animalWeight;
    }

    public static void setAnimalWeight(Double animalWeight) {
        Animal.animalWeight = animalWeight;
    }

    public static String getAnimalType() {
        return animalType;
    }

    public static void setAnimalType(String animalType) {
        Animal.animalType = animalType;
    }

    public void eat(Integer i) {
        this.FoodEaten = i;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return animalType + "[" +
                animalName + " " +
                animalWeight + " " + livingRegion + " " +
                FoodEaten + "]";
    }

    public Integer getFoodEaten() {
        return FoodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        FoodEaten = foodEaten;
    }
}

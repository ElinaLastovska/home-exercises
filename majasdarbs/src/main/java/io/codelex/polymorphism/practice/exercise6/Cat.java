package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    static String breed;

    public static void setBreed(String breed) {
        Cat.breed = breed;
    }

    @Override
    public String toString() {
        return animalType + "[" +
                animalName + " " +
                breed + " " +
                animalWeight + " " +
                livingRegion + " " +
                FoodEaten + "]";

    }

    public void makeSound() {
        System.out.println("> Meeeouw");
    }
}

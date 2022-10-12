package io.codelex.polymorphism.practice.exercise6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.apache.commons.lang3.math.NumberUtils.toInt;


public class AnimalTest {
    public static void main(String[] args) throws IOException {

        System.out.println("{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]");
        Scanner scan = new Scanner(System.in);
        List<Animal> myAnimals = new ArrayList<>();
        Animal animal = null;
        for (int i = 0; i < 2; i++) {

            String[] newAnimal;
            newAnimal = scan.nextLine().split(" ");

            animalSounds(newAnimal);

            String[] newFood;
            newFood = scan.nextLine().split(" ");

            inputFood(newFood);


            switch (newAnimal[0]) {
                case "Cat" -> {
                    animal = new Cat();
                    getCommonParameters(newAnimal);
                    Cat.setBreed(newAnimal[4]);
                    animal.eat(Integer.parseInt(newFood[1]));
                    System.out.println("> " + animal);
//                    myAnimals.add(animal);
                }
                case "Tiger" -> {
                    animal = new Tiger();
                    getCommonParameters(newAnimal);
                    checkIfFoodMeat(newFood, animal);

                    System.out.println("> " + animal);
//                    myAnimals.add(animal);
                }
                case "Mouse" -> {
                    animal = new Mouse();
                    getCommonParameters(newAnimal);
                    checkIfFoodVegetable(newFood, animal);

                    System.out.println("> " + animal);
                }
                case "Zebra" -> {
                    animal = new Zebra();
                    getCommonParameters(newAnimal);
                    checkIfFoodVegetable(newFood, animal);

                    System.out.println("> " + animal);
                }

            }
            myAnimals.add(animal);
        }
        System.out.println("End");
        System.out.println(myAnimals);
    }

    public static void animalSounds(String[] newAnimal) {
        Animal animal;
        switch (newAnimal[0]) {
            case "Cat" -> {
                animal = new Cat();
                animal.makeSound();
            }
            case "Tiger" -> {
                animal = new Tiger();
                animal.makeSound();
            }
            case "Mouse" -> {
                animal = new Mouse();
                animal.makeSound();
            }
            case "Zebra" -> {
                animal = new Zebra();
                animal.makeSound();
            }
        }
    }

    public static void inputFood(String[] newFood) {
        if (newFood[0].equals("Vegetable")) {
            new Vegetable();
            Food.setQuantity(toInt(newFood[1]));
        } else if (newFood[0].equals("Meat")) {
            new Meat();
            Food.setQuantity(toInt(newFood[1]));
        }
    }

    public static void getCommonParameters(String[] newAnimal) {
//        NumberFormat formatter = new DecimalFormat("#.#");
//        System.out.println(formatter.format(Animal.animalWeight));
        Animal.setAnimalType(newAnimal[0]);
        Animal.setAnimalName(newAnimal[1]);
        Animal.setAnimalWeight(Double.valueOf(newAnimal[2]));
        Mammal.setLivingRegion(newAnimal[3]);


    }


    public static void checkIfFoodMeat(String[] newFood, Animal animal) {
        if (newFood[0].equals("Meat")) {
            animal.eat(Integer.parseInt(newFood[1]));
        } else {
            System.out.println(Animal.getAnimalType() + "are not eating that type of food!");
        }
    }

    public static void checkIfFoodVegetable(String[] newFood, Animal animal) {
        if (newFood[0].equals("Vegetable")) {
            animal.eat(Integer.parseInt(newFood[1]));
        } else {
            System.out.println(Animal.getAnimalType() + "are not eating that type of food!");
        }
    }
}

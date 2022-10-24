package io.codelex.classesandobjects.practice.Dog;

public class DogTest {
    public static void main(String[] args) {

        Dog max = new Dog("Max", "male", "Lady", "Rocky");//"Max","male"

        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");//"Rocky","male"

        Dog sparky = new Dog("Sparky", "male");//"Sparky","male"

        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");//"Buster","male"

        Dog sam = new Dog("Sam", "male");//"Sam","male"

        Dog lady = new Dog("Lady", "female");//"Lady","female"

        Dog molly = new Dog("Molly", "female");//"Molly","female"

        Dog coco = new Dog("Coco", "female", "Molly", "Buster");//"Coco","female"


        molly.fathersName();
        System.out.println(coco.hasSameMotherAs(rocky));

    }
}

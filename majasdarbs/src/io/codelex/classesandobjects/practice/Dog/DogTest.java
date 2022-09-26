package io.codelex.classesandobjects.practice.Dog;

public class DogTest {
    public static void main(String[] args) {

        Dog max = new Dog("Max", "male", "Lady", "Rocky");//"Max","male"

        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");//"Rocky","male"

        Dog sparky = new Dog("Sparky", "male", null, null);//"Sparky","male"

        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");//"Buster","male"

        Dog sam = new Dog("Sam", "male", null, null);//"Sam","male"

        Dog lady = new Dog("Lady", "female", null, null);//"Lady","female"

        Dog molly = new Dog("Molly", "female", null, null);//"Molly","female"

        Dog coco = new Dog("Coco", "female", "Molly", "Buster");//"Coco","female"


        molly.fathersName();
        System.out.println(coco.hasSameMotherAs(rocky));

    }
}

package io.codelex.classesandobjects.practice.Dog;

import java.util.Objects;

public class Dog {

    public String name;
    public String sex;
    public String mother;
    public String father;


    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public void fathersName() {
        if (father != null) {
            System.out.println(father);

        } else {
            System.out.println("Unknown");
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return Objects.equals(mother, otherDog.mother);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }


}

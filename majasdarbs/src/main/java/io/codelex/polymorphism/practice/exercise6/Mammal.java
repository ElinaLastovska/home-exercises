package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    static String livingRegion;

    public static void setLivingRegion(String livingRegion) {
        Mammal.livingRegion = livingRegion;
    }
}

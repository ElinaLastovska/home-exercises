package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    int numberOfCopies;
    int costPerCopy;

    public Poster(int fee, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() +
                " numberOfCopies = " + numberOfCopies +
                ", costPerCopy = " + costPerCopy;
    }
}

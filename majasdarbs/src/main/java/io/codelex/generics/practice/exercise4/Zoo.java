package io.codelex.generics.practice.exercise4;

class Zoo {
    void feedAnimal(Cage cage) {
//        feed(cage.getAnimal().lunchBag, cage.getAnimal());
        /*code given in each section*/
    }

    <F extends Food> void feed(F food, Animal<F> animal) {
        animal.eat(food);
    }

    void manage() {

        /*your code here*/
    }
}

package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * <p>
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * <p>
 * <p>
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * <p>
 * <p>
 * 3. Create one instance of an each car and add them to list.
 * <p>
 * <p>
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * <p>
 * <p>
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Audi a = new Audi();
        Bmw b = new Bmw();
        Lexus c = new Lexus();
        Tesla d = new Tesla();
        Honda e = new Honda();
        Volvo f = new Volvo();
        cars.add(a);
        cars.add(b);
        cars.add(c);
        cars.add(d);
        cars.add(e);
        cars.add(f);

        for (int i = 0; i <= 10; i++) {
            for (Car z : cars) {
                z.speedUp();
                if (i == 3 && z instanceof BoostCar) {
                    ((BoostCar) z).useNitrousOxideEngine();
                }
                // System.out.println(z.showCurrentSpeed());
                // System.out.println(z);
            }

        }
        // System.out.println(dragRaceList);

//        List<Car> fastestCar = cars.stream().max(Comparator.comparing(Car::showCurrentSpeed)).stream().toList();
////
//        System.out.println(fastestCar);
//

//        List<Car> sortedList = cars.stream().sorted().toList();
//        sortedList.forEach(System.out::println);


    }
}

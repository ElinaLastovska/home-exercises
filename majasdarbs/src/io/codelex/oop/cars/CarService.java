package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class CarService {

    static ArrayList<Car> cars = new ArrayList<>();
    static ArrayList<Car> carsByYear = new ArrayList<>();
    static ArrayList<Car> carsByEngine = new ArrayList<>();
    static ArrayList<Car> CarByManufacturerCount = new ArrayList<>();
    static ArrayList<Car> CarsByManufacturer = new ArrayList<>();
    static ArrayList<Car> CarsByManufacturerYear = new ArrayList<>();


    public static void addCar(Car b) {
        cars.add(b);
    }

    public static void removeCar(Car b) {
        cars.remove(b);
    }

    public static void returnCarList() {
        System.out.println(cars.toString());

    }

    public static void returnCarByYear(int year) {
        for (Car b : cars) {
            if (b.getYearOfManufacture() <= year) {
                carsByYear.add(b);
            }
        }
        System.out.println(carsByYear.toString());
    }

    public static void returnCarByEngine(EngineType a) {
        for (Car b : cars) {
            if (b.getEngine() == EngineType.V12) {
                carsByEngine.add(b);
            }

        }
        System.out.println(carsByEngine.toString());

    }

    public static void returnCarByManufacturerCount(int count) {
        for (Car b : cars) {
            if (b.carsManufacturer.length == count) {
                CarByManufacturerCount.add(b);
            }
        }
        System.out.println(CarByManufacturerCount.toString());

    }


    public static void returnMostExpensiveCar() {
        int maxValue = 0;

        for (Car b : cars) {
            if (b.getPrice() > maxValue)
                maxValue = b.getPrice();
        }
        for (Car b : cars) {
            if (b.getPrice() == maxValue)
                System.out.println(b);
        }
    }

    public static void returnCheapestCar() {
        System.out.println(cars.stream().min(Comparator.comparing(Car::getPrice)));
    }


    public static void sortAscending() {
        cars.sort(Comparator.comparing(Car::getEngine));

    }

    public static void sortDescending() {
        cars.sort(Comparator.comparing(Car::getEngine));
        Collections.reverse(cars);

    }

    public static boolean isCarOnList(Car a) {
        return cars.contains(a);
    }

    public static void ifOnListGetCarsManufacturer(Car b) {
        if (cars.contains(b)) {
            b.getAndPrintCarsManufacturer();
        } else {
            System.out.println("We do not have this car anymore!");
        }
    }

    public static void returnCarsByManufacturer(String manufacturerName) {
        for (Car b : cars) {
            if (Objects.equals(b.getCarsManufacturer(), manufacturerName)) {
                System.out.print("User found in the collection");
                CarsByManufacturer.add(b);
            }
        }
        System.out.println(CarsByManufacturer.toString());
    }

//    public static void returnCarsByManufacturerYear(int year) {
//        for (Car b : cars) {
//            if (b.getCarsManufacturer().matches(returnManufacturerByYear(year))) {
//
//                CarsByManufacturerYear.add(b);
//            }
//        }
//        System.out.println(CarsByManufacturerYear.toString());
//
//    }
}

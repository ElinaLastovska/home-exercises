package io.codelex.oop.cars;

import static io.codelex.oop.cars.Car.addManufacturer;
import static io.codelex.oop.cars.Car.getManufacturerList;
import static io.codelex.oop.cars.CarService.*;

public class TestClass {
    public static void main(String[] args) {

        Manufacturer z = new Manufacturer("Volvo", 1200, "Latvia");
        Manufacturer v = new Manufacturer("Invo", 2031, "Polija");
        Manufacturer m = new Manufacturer("Lolo", 2013, "Vācija");
        System.out.println(z.getCountry());
        System.out.println(z.getName());
        System.out.println(z.getYearOfEstablishment());
        addManufacturer(z);
        addManufacturer(m);
        addManufacturer(v);
        getManufacturerList();

        Car b = new Car("Audi", "ASD", 200, 2000, EngineType.V12, "Volvo", "Invo", "Lolo");
        Car c = new Car("BMW", "EEE", 3450, 2000, EngineType.V6, "Lolo");
        Car d = new Car("Mazda", "sgre", 2340, 1888, EngineType.S3, "Volvo");
        Car e = new Car("Suzuki", "tdjg", 300, 1999, EngineType.V12);
        //adding cars to the list
        addCar(d);
        addCar(c);
        addCar(b);
        //removing a car from the list
        removeCar(d);
        addCar(e);

        //returning a list of all cars
        returnCarList();

        //returning cars with a V12 engine
        returnCarByEngine(EngineType.V12);

        // returning cars produced before 1999
        returnCarByYear(1999);

        //returning the most expensive car
        returnMostExpensiveCar();

        //returning the cheapest car
        returnCheapestCar();

        //returning the car with at least 3 manufacturers
        returnCarByManufacturerCount(3);

        //returning a list of all cars sorted according to the passed parameter: ascending / descending
        sortAscending();
        sortDescending();

        //checking if a specific car is on the list
        ifOnListGetCarsManufacturer(d);
        ifOnListGetCarsManufacturer(b);

        //returning a list of cars manufactured by a specific manufacturer
        returnCarsByManufacturer("Volvo");

        //returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
        //    =,! = from the given.


        // returnManufacturerByYear(1999);


    }


}

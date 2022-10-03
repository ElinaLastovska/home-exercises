package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Car {

    static ArrayList<Manufacturer> manufacturerList = new ArrayList<>();
    static ArrayList<String> manufacturersByYear = new ArrayList<>();


    private final String name;
    private final String model;
    private final int price;
    private final int yearOfManufacture;
    EngineType engine;
    String[] carsManufacturer;


    public Car(String name, String model, int price, int yearOfManufacture, EngineType engine, String... carsManufacturer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.carsManufacturer = carsManufacturer;
    }

    public static void addManufacturer(Manufacturer a) {
        manufacturerList.add(a);
    }

    public static void getManufacturerList() {
        System.out.println(manufacturerList.toString());
    }

    public static void returnManufacturerByYear(int year) {
        for (Manufacturer b : manufacturerList) {
            if (b.getYearOfEstablishment() <= year) {
                manufacturersByYear.add(b.getName());
            }
        }
        System.out.println(manufacturersByYear.toString());
    }

    public void getAndPrintCarsManufacturer() {
        for (String c : carsManufacturer)
            System.out.print(c + " ");
        System.out.println();
    }

    public String getCarsManufacturer() {
        for (String c : carsManufacturer)
            return c;
        return null;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engine=" + engine +
                ", carsManufacturer=" + Arrays.toString(carsManufacturer) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public EngineType getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return price == car.price && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && engine == car.engine && Arrays.equals(carsManufacturer, car.carsManufacturer);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, model, price, yearOfManufacture, engine);
        result = 31 * result + Arrays.hashCode(carsManufacturer);
        return result;
    }


}

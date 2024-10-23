package homework29.carGarageClasswork29.carGarage.ait.cars.dao;

import homework29.carGarageClasswork29.carGarage.ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
        size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length) {
            System.out.println("Cannot add car: Garage is full or car is null.");
            return false;
        }
        cars[size++] = car;
        System.out.println("Car added: " + car);
        return true;
    }

    @Override
    public boolean removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                cars[i] = cars[size - 1];  // заменяем на последнюю машину
                cars[size - 1] = null;  // обнуляем последний элемент
                size--;
                System.out.println("Car removed: " + regNumber);
                return true;
            }
        }
        System.out.println("Car not found: " + regNumber);
        return false;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                System.out.println("Car found: " + cars[i]);
                return cars[i];
            }
        }
        System.out.println("Car not found: " + regNumber);
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double minEngine, double maxEngine) {
        return findCarsByPredicate(car -> car.getEngine() >= minEngine && car.getEngine() <= maxEngine);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(car -> car.getColor().equals(color));
    }

    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        Car[] result = new Car[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                result[count++] = cars[i];
            }
        }
        Car[] trimmedResult = new Car[count];
        System.arraycopy(result, 0, trimmedResult, 0, count);
        System.out.println("Cars found: " + count);
        return trimmedResult;
    }

    @Override
    public int size() {
        System.out.println("Number of cars in the garage: " + size);
        return size;
    }

    @Override
    public void printCars() {
        System.out.println("List of cars in the garage:");
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }
}

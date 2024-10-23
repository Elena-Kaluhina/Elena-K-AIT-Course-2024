package homework29.carGarage.car_garage;

import homework29.carGarage.car_sorting.Car;

import java.util.ArrayList;
import java.util.List;

public class GarageImpl implements Garage {

    private List<Car> cars;
    private int capacity;

    // Конструктор
    public GarageImpl(int capacity) {
        this.capacity = capacity;
        cars = new ArrayList<>();
    }

    @Override
    public boolean addCar(Car car) {
        if (cars.size() >= capacity || cars.contains(car)) {
            return false;
        }
        cars.add(car);
        System.out.println("Car added: " + car);
        return true;
    }

    @Override
    public boolean removeCar(Car car) {
        boolean removed = cars.remove(car);
        if (removed) {
            System.out.println("Car removed: " + car);
        } else {
            System.out.println("Car not found: " + car);
        }
        return removed;
    }

    @Override
    public Car findCar(Car car) {
        int index = cars.indexOf(car);
        if (index != -1) {
            System.out.println("Car found: " + cars.get(index));
            return cars.get(index);
        }
        System.out.println("Car not found: " + car);
        return null;
    }

    @Override
    public List<Car> findCarsByModel(String model) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                result.add(car);
            }
        }
        System.out.println("Cars found by model " + model + ": " + result.size());
        return result;
    }

    @Override
    public int size() {
        return cars.size();
    }

    @Override
    public void printCars() {
        System.out.println("List of cars in garage:");
        cars.forEach(System.out::println);
    }
}

package homework29.carGarage.car_garage;

import homework29.carGarage.car_sorting.Car;

import java.util.List;

public interface Garage {

    boolean addCar(Car car);  // Добавить машину в гараж

    boolean removeCar(Car car);  // Удалить машину по регистрационному номеру

    Car findCar(Car car);  // Найти машину по регистрационному номеру

    List<Car> findCarsByModel(String model);  // Найти машины по модели

    int size();  // Возвращает количество машин в гараже

    void printCars();  // Выводит список всех машин в гараже
}

package homework31.carGarage.carGarage.ait.cars.dao;

import homework31.carGarage.carGarage.ait.cars.model.Car;//Флотом автомобилей, который использует гараж, необходимо управлять:
//- знать сколько машин стоит в гараже
//- добавлять машины в гараж +
//- удалять машины из гаража +
//- проверять, есть ли машина с таким-то госномером в гараже +
//- сколько машин определенного бренда стоит в гараже? +
//- сколько машин от какой-то компании стоит в гараже +
//- сколько машин определенного цвета стоит в гараже +
//- сколько машин с мощностью двигателя "от ... и до ..." kWt имеется в гараже +

public interface Garage {

    boolean addCar(Car car);

    boolean removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Car[] findCarsByModel(String model);

    Car[] findCarsByCompany(String company);

    Car[] findCarsByEngine(double min, double max);

    Car[] findCarsByColor(String color);

    int size();

    void printCars();

    // Новые методы сортировки, добавленные к существующему интерфейсу
    Car[] sortByBrand();  // сортировка по бренду (модели)

    Car[] sortByColor();  // сортировка по цвету

    Car[] sortByCompany();  // сортировка по компании
}


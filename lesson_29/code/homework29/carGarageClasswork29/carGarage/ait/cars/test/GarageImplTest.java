package homework29.carGarageClasswork29.carGarage.ait.cars.test;

import homework29.carGarageClasswork29.carGarage.ait.cars.dao.Garage;
import homework29.carGarageClasswork29.carGarage.ait.cars.dao.GarageImpl;
import homework29.carGarageClasswork29.carGarage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCarTest() {
        Car newCar = new Car("Number5", "Model5", "Company3", 3.0, "Blue");
        assertTrue(garage.addCar(newCar));
        garage.size();  // Печать количества машин
        garage.printCars();  // Печать списка машин

        // Test adding beyond capacity
        assertFalse(garage.addCar(new Car("Number6", "Model6", "Company3", 3.0, "Blue")));
        garage.size();  // Печать количества машин после попытки добавления
    }

    @Test
    void removeCarTest() {
        assertTrue(garage.removeCar("Number1"));
        garage.size();  // Печать количества машин
        garage.printCars();  // Печать списка машин

        // Test removing non-existent car
        assertFalse(garage.removeCar("Number6"));
    }

    @Test
    void findCarByRegNumberTest() {
        Car foundCar = garage.findCarByRegNumber("Number2");
        assertNotNull(foundCar);

        // Test finding non-existent car
        Car notFoundCar = garage.findCarByRegNumber("Number6");
        assertNull(notFoundCar);
    }

    @Test
    void findCarsByModelTest() {
        Car[] carsFound = garage.findCarsByModel("Model1");
        assertEquals(2, carsFound.length);
        garage.printCars();  // Печать найденных машин
    }

    @Test
    void findCarsByCompanyTest() {
        Car[] carsFound = garage.findCarsByCompany("Company1");
        assertEquals(2, carsFound.length);
    }

    @Test
    void findCarsByEngineTest() {
        Car[] carsFound = garage.findCarsByEngine(1.0, 1.6);
        assertEquals(2, carsFound.length);
    }

    @Test
    void findCarsByColorTest() {
        Car[] carsFound = garage.findCarsByColor("Red");
        assertEquals(2, carsFound.length);
    }

    @Test
    void sizeTest() {
        assertEquals(4, garage.size());
    }

    @Test
    void printCarsTest() {
        garage.printCars();  // Печать списка всех машин в гараже
    }
}

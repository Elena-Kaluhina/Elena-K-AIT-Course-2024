package homework29.carGarage.car_garage;

import homework29.carGarage.car_sorting.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[] {
                new Car("Toyota", "Red", 30000, 2020),
                new Car("Honda", "Blue", 25000, 2019),
                new Car("Ford", "Black", 28000, 2021),
                new Car("BMW", "White", 45000, 2018)
        };
        for (Car car : cars) {
            garage.addCar(car);
        }
    }

    @Test
    void testAddCar() {
        Car newCar = new Car("Tesla", "Silver", 60000, 2022);
        assertTrue(garage.addCar(newCar));
        garage.printCars();

        // Test adding beyond capacity
        assertFalse(garage.addCar(new Car("Audi", "Green", 50000, 2021)));
    }

    @Test
    void testRemoveCar() {
        assertTrue(garage.removeCar(cars[0]));
        garage.printCars();
    }

    @Test
    void testFindCar() {
        assertNotNull(garage.findCar(cars[1]));
    }

    @Test
    void testFindCarsByModel() {
        assertEquals(1, garage.findCarsByModel("BMW").size());
    }
}

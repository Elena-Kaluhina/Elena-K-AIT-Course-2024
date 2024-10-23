package homework29.carGarage.car_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[] {
                new Car("Toyota", "Red", 30000, 2020),
                new Car("Honda", "Blue", 25000, 2019),
                new Car("Ford", "Black", 28000, 2021),
                new Car("BMW", "White", 45000, 2018)
        };
    }

    @Test
    void testSortByModel() {
        Arrays.sort(cars);
        System.out.println("Sorting by model:");
        Arrays.stream(cars).forEach(System.out::println);
        assertEquals("BMW", cars[0].getModel());
        assertEquals("Toyota", cars[cars.length - 1].getModel());
    }

    @Test
    void testSortByColor() {
        Arrays.sort(cars, CarComparators.sortByColor);
        System.out.println("Sorting by color:");
        Arrays.stream(cars).forEach(System.out::println);
        assertEquals("Black", cars[0].getColor());
        assertEquals("White", cars[cars.length - 1].getColor());
    }

    @Test
    void testSortByPrice() {
        Arrays.sort(cars, CarComparators.sortByPrice);
        System.out.println("Sorting by price:");
        Arrays.stream(cars).forEach(System.out::println);
        assertEquals(25000, cars[0].getPrice());
        assertEquals(45000, cars[cars.length - 1].getPrice());
    }

    @Test
    void testSortByYear() {
        Arrays.sort(cars, CarComparators.sortByYear);
        System.out.println("Sorting by year:");
        Arrays.stream(cars).forEach(System.out::println);
        assertEquals(2018, cars[0].getYear());
        assertEquals(2021, cars[cars.length - 1].getYear());
    }
}

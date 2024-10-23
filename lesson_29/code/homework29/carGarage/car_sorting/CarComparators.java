package homework29.carGarage.car_sorting;

import java.util.Comparator;

public class CarComparators {

    // Comparator for sorting by color
    public static Comparator<Car> sortByColor = new Comparator<>() {
        @Override
        public int compare(Car c1, Car c2) {
            return c1.getColor().compareTo(c2.getColor());
        }
    };

    // Comparator for sorting by price
    public static Comparator<Car> sortByPrice = new Comparator<>() {
        @Override
        public int compare(Car c1, Car c2) {
            return Double.compare(c1.getPrice(), c2.getPrice());
        }
    };

    // Comparator for sorting by year of manufacture
    public static Comparator<Car> sortByYear = new Comparator<>() {
        @Override
        public int compare(Car c1, Car c2) {
            return Integer.compare(c1.getYear(), c2.getYear());
        }
    };
}

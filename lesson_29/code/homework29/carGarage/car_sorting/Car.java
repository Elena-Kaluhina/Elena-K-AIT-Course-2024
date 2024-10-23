package homework29.carGarage.car_sorting;

import java.util.Objects;

public class Car implements Comparable<Car> {

    // Fields
    private String model;
    private String color;
    private double price;
    private int year;

    // Constructor
    public Car(String model, String color, double price, int year) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price, year);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    // Method for sorting by model
    @Override
    public int compareTo(Car car) {
        return this.model.compareTo(car.model);
    }
}

package homework27.computer.model;

import java.util.Objects;

public class Computer {

    //fields
    private String id; // ID компьютера
    private String brand;
    private double price;
    private boolean discountAvailable;


    //constructor
    public Computer(String id, String brand, double price, boolean discountAvailable) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.discountAvailable = discountAvailable;
    }

    //getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isDiscountAvailable() { return discountAvailable; }
    public void setDiscountAvailable(boolean discountAvailable) { this.discountAvailable = discountAvailable; }

    //метод equals для сравнения компьютеров по id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(id, computer.id);
    }

    //метод hashCode для использования в коллекциях
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{id='").append(id).append('\'')
                .append(", brand='").append(brand).append('\'')
                .append(", price=").append(price)
                .append(", discountAvailable=").append(discountAvailable)
                .append('}');
        return sb.toString();
    }
}


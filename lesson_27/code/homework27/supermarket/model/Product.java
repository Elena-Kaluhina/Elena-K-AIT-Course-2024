package homework27.supermarket.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    //fields
    private String id; // ID продукта (например, штрих-код)
    private String name;
    private double price;
    private LocalDate expirationDate;

    //constructor
    public Product(String id, String name, double price, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    // equals и hashCode для сравнения продуктов по id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{id='").append(id).append('\'')
                .append(", name='").append(name).append('\'')
                .append(", price=").append(price)
                .append(", expirationDate=").append(expirationDate)
                .append('}');
        return sb.toString();
    }
}


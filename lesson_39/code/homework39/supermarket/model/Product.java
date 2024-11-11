package homework39.supermarket.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private long barCode;          // Штрихкод
    private String name;           // Название продукта
    private String category;       // Категория продукта
    private String brand;          // Бренд продукта
    private double price;          // Цена продукта
    private LocalDate expDate;     // Срок годности

    public Product(long barCode, String name, String category, String brand, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{")
                .append("barCode=").append(barCode)
                .append(", name='").append(name).append('\'')
                .append(", category='").append(category).append('\'')
                .append(", brand='").append(brand).append('\'')
                .append(", price=").append(price)
                .append(", expDate=").append(expDate)
                .append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}

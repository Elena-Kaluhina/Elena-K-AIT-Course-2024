package homework27.supermarket.dao;

import homework27.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SupermarketImpl implements Supermarket {

    private List<Product> products;

    public SupermarketImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);  // Create
    }

    @Override
    public Product findProductById(String id) {
        for (Product product : products) {  // Read
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findProductsByExpirationDate(String date) {
        LocalDate targetDate = LocalDate.parse(date);  // Read по сроку годности
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (!product.getExpirationDate().isAfter(targetDate)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public void updateProduct(Product updatedProduct) {  // Update
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(updatedProduct.getId())) {
                products.set(i, updatedProduct);  // Обновляем продукт
                break;
            }
        }
    }

    @Override
    public void removeProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));  // Delete
    }

    @Override
    public double getTotalPrice() {  // Получение общей стоимости
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public double getAveragePrice() {  // Получение средней стоимости
        return products.stream().mapToDouble(Product::getPrice).average().orElse(0);
    }

    @Override
    public void printAllProducts() {
        for (Product product : products) {
            System.out.println(product);  // Печать всех продуктов
        }
    }
}


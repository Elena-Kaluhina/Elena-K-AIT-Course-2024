package homework27.supermarket.dao;

import homework27.supermarket.model.Product;

import java.util.List;

public interface Supermarket {

    void addProduct(Product product);  // Create

    Product findProductById(String id);  // Read

    List<Product> findProductsByExpirationDate(String date);  // Read

    void updateProduct(Product product);  // Update

    void removeProduct(String id);  // Delete

    double getTotalPrice();  //дополнительная операция для получения общей стоимости

    double getAveragePrice();  //дополнительная операция для получения средней стоимости

    void printAllProducts();  //печать всех продуктов
}

package homework27.computer.dao;

import homework27.computer.model.Computer;

import java.util.List;

public interface Shop {

    void addProduct(Computer product);  // Create

    Computer findProductById(String id);  // Read

    List<Computer> findDiscountedProducts();  // Read

    void updateProduct(Computer product);  // Update

    void removeProduct(String id);  // Delete

    void printAllProducts();  //дополнительный метод для отображения всех продуктов
}



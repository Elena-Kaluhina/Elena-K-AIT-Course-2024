package homework27.computer.dao;

import homework27.computer.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class ShopImpl implements Shop {

    private List<Computer> products;

    public ShopImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Computer product) {
        products.add(product);  // Create
    }

    @Override
    public Computer findProductById(String id) {
        for (Computer product : products) {  // Read
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Computer> findDiscountedProducts() {
        List<Computer> result = new ArrayList<>();  // Read
        for (Computer product : products) {
            if (product.isDiscountAvailable()) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public void updateProduct(Computer updatedProduct) {  // Update
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(updatedProduct.getId())) {
                products.set(i, updatedProduct);  //обновляем продукт
                break;
            }
        }
    }

    @Override
    public void removeProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));  // Delete
    }

    @Override
    public void printAllProducts() {
        for (Computer product : products) {
            System.out.println(product);  //дополнительный метод для вывода всех продуктов
        }
    }
}


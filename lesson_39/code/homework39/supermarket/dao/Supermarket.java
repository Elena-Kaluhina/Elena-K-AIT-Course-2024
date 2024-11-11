package homework39.supermarket.dao;

import homework39.supermarket.model.Product;

public interface Supermarket {

    boolean addProduct(Product product);                   // Добавить продукт

    Product removeProduct(long barCode);                   // Удалить продукт по штрихкоду

    Product findByBarCode(long barCode);                   // Найти продукт по штрихкоду

    Iterable<Product> findByCategory(String category);     // Найти продукты по категории

    Iterable<Product> findByBrand(String brand);           // Найти продукты по бренду

    Iterable<Product> findProductsWithExpiredDate();       // Найти продукты с истекшим сроком годности

    int skuQuantity();                                     // Получить количество SKU
}

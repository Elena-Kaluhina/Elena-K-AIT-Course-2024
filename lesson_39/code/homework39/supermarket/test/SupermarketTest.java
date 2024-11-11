package homework39.supermarket.test;

import homework39.supermarket.dao.SupermarketImpl;
import homework39.supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketTest {

    public static void main(String[] args) {
        SupermarketImpl supermarket = new SupermarketImpl();

        // Добавляем несколько продуктов
        supermarket.addProduct(new Product(1001, "Milk", "Dairy", "BrandA", 1.5, LocalDate.of(2024, 11, 1)));
        supermarket.addProduct(new Product(1002, "Bread", "Bakery", "BrandB", 0.9, LocalDate.of(2024, 10, 30)));
        supermarket.addProduct(new Product(1003, "Cheese", "Dairy", "BrandA", 2.5, LocalDate.of(2024, 10, 15)));
        supermarket.addProduct(new Product(1004, "Apple", "Fruit", "BrandC", 0.5, LocalDate.of(2024, 11, 5)));

        // Печать всех продуктов
        System.out.println("All Products:");
        supermarket.findByCategory("").forEach(System.out::println);

        // Печать продуктов с истекшим сроком годности
        System.out.println("\nExpired Products:");
        supermarket.findProductsWithExpiredDate().forEach(System.out::println);

        // Тесты других методов
        System.out.println("\nFind Product by Barcode 1001:");
        System.out.println(supermarket.findByBarCode(1001));

        System.out.println("\nRemove Product with Barcode 1002:");
        System.out.println(supermarket.removeProduct(1002));

        System.out.println("\nAll Products after removal:");
        supermarket.findByCategory("").forEach(System.out::println);
    }
}

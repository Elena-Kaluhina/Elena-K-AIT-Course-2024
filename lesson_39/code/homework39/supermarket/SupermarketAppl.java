package homework39.supermarket;

import homework39.supermarket.dao.SupermarketImpl;
import homework39.supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketAppl {

    public static void main(String[] args) {

        // Создаем экземпляр супермаркета
        SupermarketImpl supermarket = new SupermarketImpl();

        // Добавляем продукты в супермаркет
        supermarket.addProduct(new Product(1001, "Milk", "Dairy", "BrandA", 1.5, LocalDate.of(2024, 11, 1)));
        supermarket.addProduct(new Product(1002, "Bread", "Bakery", "BrandB", 0.9, LocalDate.of(2024, 10, 30)));
        supermarket.addProduct(new Product(1003, "Cheese", "Dairy", "BrandA", 2.5, LocalDate.of(2024, 10, 15)));
        supermarket.addProduct(new Product(1004, "Apple", "Fruit", "BrandC", 0.5, LocalDate.of(2024, 11, 5)));
        supermarket.addProduct(new Product(1005, "Yogurt", "Dairy", "BrandA", 1.2, LocalDate.of(2024, 11, 3)));
        supermarket.addProduct(new Product(1006, "Banana", "Fruit", "BrandC", 1.1, LocalDate.of(2024, 11, 2)));

        // Вывод всех продуктов в супермаркете
        System.out.println("All Products in Supermarket:");
        supermarket.findByCategory("").forEach(System.out::println);

        // Печать продуктов с истекшим сроком годности
        System.out.println("\nExpired Products:");
        supermarket.findProductsWithExpiredDate().forEach(System.out::println);

        // Поиск продуктов по бренду
        System.out.println("\nProducts by Brand 'BrandA':");
        supermarket.findByBrand("BrandA").forEach(System.out::println);

        // Поиск продуктов по категории
        System.out.println("\nProducts in Category 'Fruit':");
        supermarket.findByCategory("Fruit").forEach(System.out::println);

        // Поиск продукта по штрихкоду
        System.out.println("\nProduct with Barcode 1001:");
        System.out.println(supermarket.findByBarCode(1001));

        // Удаление продукта по штрихкоду
        System.out.println("\nRemoving Product with Barcode 1002:");
        Product removedProduct = supermarket.removeProduct(1002);
        System.out.println("Removed: " + removedProduct);

        // Вывод всех продуктов после удаления
        System.out.println("\nAll Products after removal:");
        supermarket.findByCategory("").forEach(System.out::println);

        // Печать общего количества уникальных SKU
        System.out.println("\nTotal SKU Quantity:");
        System.out.println(supermarket.skuQuantity());
    }
}
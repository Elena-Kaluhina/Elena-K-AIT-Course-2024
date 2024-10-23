package homework27.supermarket.test;

import homework27.supermarket.dao.Supermarket;
import homework27.supermarket.dao.SupermarketImpl;
import homework27.supermarket.model.Food;
import homework27.supermarket.model.MilkFood;
import homework27.supermarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SupermarketTest {

    private Supermarket supermarket;

    @BeforeEach
    public void setUp() {
        supermarket = new SupermarketImpl();  // Используем реализацию SupermarketImpl
    }

    @Test
    public void testAddProduct() {
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        supermarket.addProduct(milk);
        assertEquals(milk, supermarket.findProductById("001"));  // Проверяем добавление продукта
    }

    @Test
    public void testFindProductsByExpirationDate() {
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        Product bread = new Food("002", "Bread", 1.00, LocalDate.of(2024, 10, 20));
        supermarket.addProduct(milk);
        supermarket.addProduct(bread);

        List<Product> products = supermarket.findProductsByExpirationDate("2024-10-20");  // Read по сроку годности
        assertEquals(1, products.size());
        assertTrue(products.contains(bread));
        assertFalse(products.contains(milk));
    }

    @Test
    public void testUpdateProduct() {
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        supermarket.addProduct(milk);

        // Обновляем продукт
        Product updatedMilk = new MilkFood("001", "Milk", 2.00, LocalDate.of(2024, 10, 30));
        supermarket.updateProduct(updatedMilk);  // Update

        // Проверяем, что продукт обновился
        Product found = supermarket.findProductById("001");
        assertEquals(2.00, found.getPrice());
        assertEquals(LocalDate.of(2024, 10, 30), found.getExpirationDate());
    }

    @Test
    public void testRemoveProduct() {
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        supermarket.addProduct(milk);
        supermarket.removeProduct("001");  // Delete
        assertNull(supermarket.findProductById("001"));
    }

    @Test
    public void testGetTotalAndAveragePrice() {
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        Product bread = new Food("002", "Bread", 1.00, LocalDate.of(2024, 10, 20));
        supermarket.addProduct(milk);
        supermarket.addProduct(bread);

        assertEquals(2.50, supermarket.getTotalPrice(), 0.001);  // Общая стоимость
        assertEquals(1.25, supermarket.getAveragePrice(), 0.001);  // Средняя стоимость
    }

    @Test
    public void testPrintAllProducts() {
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        Product bread = new Food("002", "Bread", 1.00, LocalDate.of(2024, 10, 20));
        supermarket.addProduct(milk);
        supermarket.addProduct(bread);

        // Проверим, что метод printAllProducts не вызывает ошибок
        assertDoesNotThrow(() -> supermarket.printAllProducts());
    }
}

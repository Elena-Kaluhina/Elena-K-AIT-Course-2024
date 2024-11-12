package homework40.supermarket_linkedlist.test;

import homework40.supermarket_linkedlist.dao.Supermarket;
import homework40.supermarket_linkedlist.dao.SupermarketImpl;
import homework40.supermarket_linkedlist.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;
    Product[] products;
    LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl();

        products = new Product[5];
        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));

        for (Product p : products) {
            supermarket.addProduct(p);
        }
    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        assertFalse(supermarket.addProduct(products[3]));

        Product product1 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(supermarket.addProduct(product1));
        assertEquals(6, supermarket.skuQuantity());

        Product product2 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(supermarket.addProduct(product2)); // Product with duplicate barcode

        Product product3 = new Product(777777, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(supermarket.addProduct(product3));
    }

    @Test
    void removeProduct() {
        assertEquals(products[1], supermarket.removeProduct(222222));
        assertEquals(4, supermarket.skuQuantity());
        assertNull(supermarket.removeProduct(222222)); // Can't remove twice
    }

    @Test
    void findByBarCode() {
        assertEquals(products[1], supermarket.findByBarCode(222222));
        assertNull(supermarket.findByBarCode(888888));
    }

    @Test
    void findByCategory() {
        List<Product> actual = new LinkedList<>((List<Product>) supermarket.findByCategory("Bread"));
        List<Product> expected = new LinkedList<>(Arrays.asList(products[0], products[4]));

        assertIterableEquals(expected, actual);
    }

    @Test
    void findByBrand() {
        List<Product> actual = new LinkedList<>((List<Product>) supermarket.findByBrand("Kolosok"));
        List<Product> expected = new LinkedList<>(Arrays.asList(products[0], products[4]));

        assertIterableEquals(expected, actual);
    }

    @Test
    void findProductsWithExpiredDate() {
        List<Product> actual = new LinkedList<>((List<Product>) supermarket.findProductsWithExpiredDate());
        List<Product> expected = new LinkedList<>(Arrays.asList(products[1], products[4]));

        assertIterableEquals(expected, actual);
    }

    @Test
    void skuQuantity() {
        assertEquals(5, supermarket.skuQuantity());
    }
}

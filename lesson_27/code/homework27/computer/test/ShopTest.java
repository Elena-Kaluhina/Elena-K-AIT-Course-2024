package homework27.computer.test;

import homework27.computer.dao.Shop;
import homework27.computer.dao.ShopImpl;
import homework27.computer.model.Computer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new ShopImpl();  //используем реализацию ShopImpl
    }

    @Test
    public void testAddProduct() {
        Computer laptop = new Computer("001", "Dell", 1200.00, false);
        shop.addProduct(laptop);
        assertEquals(laptop, shop.findProductById("001"));  //проверяем добавление продукта (Create + Read)
    }

    @Test
    public void testFindDiscountedProducts() {
        Computer laptop1 = new Computer("001", "Dell", 1200.00, true);
        Computer laptop2 = new Computer("002", "HP", 1000.00, false);
        shop.addProduct(laptop1);
        shop.addProduct(laptop2);

        List<Computer> discounted = shop.findDiscountedProducts();  // Read
        assertEquals(1, discounted.size());
        assertTrue(discounted.contains(laptop1));
        assertFalse(discounted.contains(laptop2));
    }

    @Test
    public void testUpdateProduct() {
        Computer laptop = new Computer("001", "Dell", 1200.00, false);
        shop.addProduct(laptop);

        //обновляем продукт
        Computer updatedLaptop = new Computer("001", "Dell", 1000.00, true);
        shop.updateProduct(updatedLaptop);  // Update

        //проверяем, что продукт обновился
        Computer found = shop.findProductById("001");
        assertEquals(1000.00, found.getPrice());
        assertTrue(found.isDiscountAvailable());
    }

    @Test
    public void testRemoveProduct() {
        Computer laptop = new Computer("001", "Dell", 1200.00, false);
        shop.addProduct(laptop);
        shop.removeProduct("001");  // Delete
        assertNull(shop.findProductById("001"));
    }

    @Test
    public void testPrintAllProducts() {
        Computer laptop1 = new Computer("001", "Dell", 1200.00, true);
        Computer laptop2 = new Computer("002", "HP", 1000.00, false);
        shop.addProduct(laptop1);
        shop.addProduct(laptop2);

        //проверим, что метод printAllProducts не вызывает ошибок
        assertDoesNotThrow(() -> shop.printAllProducts());
    }
}


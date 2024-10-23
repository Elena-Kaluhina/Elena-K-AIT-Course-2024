package homework27.computer;

import homework27.computer.dao.Shop;
import homework27.computer.dao.ShopImpl;
import homework27.computer.model.Computer;

public class ShopApp {

    public static void main(String[] args) {

        Shop shop = new ShopImpl();


        //создание продуктов (операция Create)
        Computer laptop1 = new Computer("001", "Dell", 1200.00, false);
        Computer laptop2 = new Computer("002", "HP", 1000.00, true);
        Computer laptop3 = new Computer("003", "Apple", 1500.00, true);

        shop.addProduct(laptop1);
        shop.addProduct(laptop2);
        shop.addProduct(laptop3);

        //чтение продуктов по ID и поиск продуктов со скидкой (операция Read)
        System.out.println("Product with ID 001: " + shop.findProductById("001"));
        System.out.println("Discounted products:");
        shop.findDiscountedProducts().forEach(System.out::println);

        //обновление информации о продукте (операция Update)
        System.out.println("Updating price and discount for product 001...");
        Computer updatedLaptop1 = new Computer("001", "Dell", 1100.00, true);
        shop.updateProduct(updatedLaptop1);

        System.out.println("Updated product with ID 001: " + shop.findProductById("001"));

        //удаление продукта (операция Delete)
        System.out.println("Removing product with ID 002...");
        shop.removeProduct("002");

        //вывод всех продуктов (операция Read)
        System.out.println("All products in the shop:");
        shop.printAllProducts();
    }
}

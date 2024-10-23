package homework27.supermarket;

import homework27.supermarket.dao.Supermarket;
import homework27.supermarket.dao.SupermarketImpl;
import homework27.supermarket.model.Food;
import homework27.supermarket.model.MilkFood;
import homework27.supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketApp {

    public static void main(String[] args) {

        Supermarket supermarket = new SupermarketImpl();  //используем реализацию интерфейса

        //создание продуктов (операция Create)
        Product milk = new MilkFood("001", "Milk", 1.50, LocalDate.of(2024, 10, 25));
        Product bread = new Food("002", "Bread", 1.00, LocalDate.of(2024, 10, 20));
        supermarket.addProduct(milk);
        supermarket.addProduct(bread);

        //чтение продуктов по сроку годности (операция Read)
        System.out.println("Products expiring by 2024-10-20:");
        supermarket.findProductsByExpirationDate("2024-10-20").forEach(System.out::println);

        //обновление продукта (операция Update)
        System.out.println("Updating price for product 001...");
        Product updatedMilk = new MilkFood("001", "Milk", 2.00, LocalDate.of(2024, 10, 30));
        supermarket.updateProduct(updatedMilk);
        System.out.println("Updated product: " + supermarket.findProductById("001"));

        //удаление продукта (операция Delete)
        System.out.println("Removing product 002...");
        supermarket.removeProduct("002");

        //печать всех продуктов (операция Read)
        System.out.println("All products in the supermarket:");
        supermarket.printAllProducts();

        //получение общей и средней стоимости продуктов
        System.out.println("Total price: " + supermarket.getTotalPrice());
        System.out.println("Average price: " + supermarket.getAveragePrice());
    }
}


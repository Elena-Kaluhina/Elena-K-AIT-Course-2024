package homework19.product;

import homework19.model.*;

public class MarketAppl {

    public static void main(String[] args) {
        Product[] products = {
                new MeatFood(10.5, "Chicken", 123456789L, "2024-12-01", "Chicken"),
                new MilkFood(5.0, "Milk", 987654321L, "2024-01-15", "Cow", 2.5),
                new NonFoodProducts(20, "Detersive", 1234567899L, "Hygiene")
        };

        // Печать всех продуктов
        printAllProducts(products);

        // Вычисление и вывод суммы всех продуктов
        System.out.println("Total price: " + calculateTotalPrice(products));

        // Поиск продукта по баркоду
        Product foundProduct = findProductByBarCode(products, 123456789L);
        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct);
        } else {
            System.out.println("Product not found");
        }
    }

    // Метод для печати всех продуктов
    public static void printAllProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Метод для вычисления общей суммы цен всех продуктов
    public static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Метод для поиска продукта по баркоду
    public static Product findProductByBarCode(Product[] products, long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    // Метод для печати всех непищевых продуктов (если были бы такие классы)
    public static void printNonFoodProducts(Product[] products) {
        for (Product product : products)
            if (!(product instanceof NonFoodProducts)) {
                System.out.println(product);
            }
        }
        //public static void printProducts (Product[]products,boolean printOnlyNonFood){
        //        for (Product product : products) {
        //            if (printOnlyNonFood) {
        //                if (!(product instanceof Food)) { //проверяем все продукты и печатаем только те, что не входят в класс Food, т.е. продукт не должен входить ни в один дочерний и последующие классы
        //                    System.out.println(product);
        //                }
        //            }
        //        }
}

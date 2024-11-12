package homework40.supermarket_linkedlist;

import homework40.supermarket_linkedlist.dao.Supermarket;
import homework40.supermarket_linkedlist.dao.SupermarketImpl;
import homework40.supermarket_linkedlist.model.Product;

import java.time.LocalDate;
import java.util.Scanner;

public class SupermarketAppl {

    public static void main(String[] args) {
        Supermarket supermarket = new SupermarketImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nSupermarket Application:");
            System.out.println("1. Add product");
            System.out.println("2. Remove product by barcode");
            System.out.println("3. Find product by barcode");
            System.out.println("4. Find products by category");
            System.out.println("5. Find products by brand");
            System.out.println("6. View expired products");
            System.out.println("7. Show total SKU quantity");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // для захвата новой строки после выбора

            switch (choice) {
                case 1 -> addProduct(scanner, supermarket);
                case 2 -> removeProduct(scanner, supermarket);
                case 3 -> findByBarcode(scanner, supermarket);
                case 4 -> findByCategory(scanner, supermarket);
                case 5 -> findByBrand(scanner, supermarket);
                case 6 -> viewExpiredProducts(supermarket);
                case 7 -> System.out.println("Total SKU quantity: " + supermarket.skuQuantity());
                case 8 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Exiting Supermarket Application.");
    }

    private static void addProduct(Scanner scanner, Supermarket supermarket) {
        System.out.print("Enter barcode: ");
        long barcode = scanner.nextLong();
        scanner.nextLine(); // очистка после long

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter expiration date (yyyy-mm-dd): ");
        String dateStr = scanner.next();
        LocalDate expDate = LocalDate.parse(dateStr);

        Product product = new Product(barcode, name, category, brand, price, expDate);
        boolean added = supermarket.addProduct(product);
        System.out.println(added ? "Product added successfully." : "Product already exists or invalid data.");
    }

    private static void removeProduct(Scanner scanner, Supermarket supermarket) {
        System.out.print("Enter barcode to remove: ");
        long barcode = scanner.nextLong();
        Product removedProduct = supermarket.removeProduct(barcode);
        System.out.println(removedProduct != null ? "Product removed: " + removedProduct : "Product not found.");
    }

    private static void findByBarcode(Scanner scanner, Supermarket supermarket) {
        System.out.print("Enter barcode to find: ");
        long barcode = scanner.nextLong();
        Product product = supermarket.findByBarCode(barcode);
        System.out.println(product != null ? product : "Product not found.");
    }

    private static void findByCategory(Scanner scanner, Supermarket supermarket) {
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Products in category \"" + category + "\":");
        supermarket.findByCategory(category).forEach(System.out::println);
    }

    private static void findByBrand(Scanner scanner, Supermarket supermarket) {
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Products of brand \"" + brand + "\":");
        supermarket.findByBrand(brand).forEach(System.out::println);
    }

    private static void viewExpiredProducts(Supermarket supermarket) {
        System.out.println("Expired products:");
        supermarket.findProductsWithExpiredDate().forEach(System.out::println);
    }
}


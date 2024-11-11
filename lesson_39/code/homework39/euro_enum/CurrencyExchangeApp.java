package homework39.euro_enum;

import java.util.Scanner;

public class CurrencyExchangeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Available currencies and exchange rates to EUR:");
            for (Currency currency : Currency.values()) {
                System.out.println(currency);
            }

            System.out.println("\nEnter the currency code (e.g., USD, GBP) or type 'exit' to quit:");
            String code = scanner.nextLine().trim().toUpperCase();

            // Проверка на завершение работы
            if (code.equals("EXIT")) {
                running = false;
                System.out.println("Exiting the currency converter. Goodbye!");
                continue;
            }

            // Проверка наличия введенного кода валюты в списке
            Currency selectedCurrency = null;
            for (Currency currency : Currency.values()) {
                if (currency.name().equals(code)) {
                    selectedCurrency = currency;
                    break;
                }
            }

            if (selectedCurrency == null) {
                System.out.println("Invalid currency code. Please try again.");
                continue;
            }

            System.out.printf("Enter the amount in %s: ", selectedCurrency.getName());
            double amount = scanner.nextDouble();
            scanner.nextLine(); // очистка буфера после nextDouble()

            double resultInEuros = amount * selectedCurrency.getRateToEuro();
            System.out.printf("You will receive %.2f EUR.%n%n", resultInEuros);
        }

        scanner.close();
    }
}

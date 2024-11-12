package homework39.euro_enum_hashSet;

import homework39.euro_enum.Currency;
import homework39.euro_enum_hashSet.EuroCurrency;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EuroCurrencyExchangeAppl {

    public static void main(String[] args) {

        Set<Currency> currencies = new HashSet<>();
        for (Currency currency : Currency.values()) {
            currencies.add(currency);
        }

        System.out.println("Available currencies for exchange:");
        currencies.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        boolean continueExchange = true;

        while (continueExchange) {
            System.out.print("\nEnter the currency code (e.g., USD, GBP): ");
            String code = scanner.next().toUpperCase();

            try {
                EuroCurrency selectedCurrency = EuroCurrency.valueOf(code);
                System.out.print("Enter the amount in " + selectedCurrency.getName() + ": ");
                double amount = scanner.nextDouble();
                double euros = selectedCurrency.convertToEuro(amount);
                System.out.printf("You will receive %.2f EUR%n", euros);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid currency code. Please try again.");
            }

            System.out.print("Do you want to exchange another amount? (yes/no): ");
            continueExchange = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thank you for using Currency Exchange!");
    }
}
package homework43.prime_numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersApp {

    public static void main(String[] args) {

        // Исходный список чисел
        List<Integer> numbers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Отбор простых чисел с использованием Stream
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbersApp::isPrime) // фильтруем только простые числа
                .collect(Collectors.toList()); // собираем результаты в список

        // Выводим отобранные простые числа
        System.out.println("Prime numbers: " + primeNumbers);
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number < 2) return false; // исключаем 1 и отрицательные числа
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)) // проверяем делители до корня числа
                .noneMatch(divisor -> number % divisor == 0); // возвращает true, если число не делится нацело ни на один из делителей
    }
}

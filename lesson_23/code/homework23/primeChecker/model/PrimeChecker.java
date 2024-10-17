package homework23.primeChecker.model;

//Для метода проверки, является ли число простым, написать тест.
// Использовать assert для логических выражений.

public class PrimeChecker {

    //метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package tasksToRepeat;

public class Task1Number17 {

    public static void main(String[] args) {
        // Переменная для хранения произведения
        int product = 1;
        boolean found = false;

        // Проходим по всем двузначным числам
        for (int i = 10; i < 100; i++) {
            // Проверяем, является ли число нечетным и кратным 17
            if (i % 17 == 0 && i % 2 != 0) {
                product *= i;
                found = true;
                System.out.println("Found number: " + i);
            }
        }

        // Проверка, были ли найдены такие числа
        if (found) {
            System.out.println("Product of all odd numbers that are multiples of 17: " + product);
        } else {
            System.out.println("No odd numbers that are multiples of 17 were found.");
        }
    }
}

package homework36.number_array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class RandomArrayListNumber {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Заполняем ArrayList 20-ю случайными числами от 1 до 10
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(10) + 1); // Генерируем числа от 1 до 10
        }

        System.out.println("Original list with duplicates: " + numbers);

        // Удаляем дубликаты, используя LinkedHashSet для сохранения порядка
        LinkedHashSet<Integer> uniqueNumbersSet = new LinkedHashSet<>(numbers);
        ArrayList<Integer> uniqueNumbers = new ArrayList<>(uniqueNumbersSet);

        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}

//Создаем ArrayList<Integer> numbers:
//Этот список будет хранить 20 случайных чисел в диапазоне от 1 до 10.
//Заполнение списка numbers:
//С помощью Random генерируем числа от 1 до 10 (включительно) и добавляем их в numbers 20 раз.
//Удаление дубликатов:
//Создаем LinkedHashSet<Integer> uniqueNumbersSet и передаем в него numbers. LinkedHashSet сохраняет порядок добавления и автоматически удаляет дубликаты.
//Создаем новый ArrayList<Integer> uniqueNumbers из uniqueNumbersSet для финального результата без дубликатов.
//Выводим результаты:
//Сначала выводим оригинальный список с дубликатами, а затем список с уникальными элементами.

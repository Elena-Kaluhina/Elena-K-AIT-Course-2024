package homework29.comparator;

import java.util.Arrays;
import java.util.Random;

public class OddEvenSortApp {
    public static void main(String[] args) {
        // создаем массив из 10 случайных чисел от 1 до 100
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // случайные числа от 1 до 100
        }

        // печатаем исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // используем компаратор OddEvenComparator для сортировки
        Integer[] arrayToSort = Arrays.stream(array).boxed().toArray(Integer[]::new); // преобразуем int[] в Integer[]
        Arrays.sort(arrayToSort, new OddEvenComparator());

        // печатаем отсортированный массив
        System.out.println("Отсортированный массив: " + Arrays.toString(arrayToSort));
    }
}


package homework36.bubble_sort;

import java.util.Random;

public class BubbleSortWithCounter {

    public static void main(String[] args) {
        // Тестирование с массивами разного размера
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            int[] array = generateRandomArray(size, 0, 1000);
            int operations = bubbleSort(array);
            System.out.println("Array size: " + size + " - Operations: " + operations);
        }
    }

    // Метод для сортировки пузырьком с подсчетом операций
    public static int bubbleSort(int[] array) {
        int n = array.length;
        int operationCount = 0; // Счетчик операций

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                operationCount++; // Увеличиваем счетчик при каждой операции сравнения
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    operationCount++; // Увеличиваем счетчик при каждой операции обмена
                }
            }
        }
        System.out.println("bubbleSort executed with " + operationCount + " operations");
        return operationCount;
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("generateRandomArray executed for array of size " + size);
        return array;
    }
}

package homework22.arrayRandom.model;
//Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
// Подсчитайте, сколько в этом массиве оказалось:
// - положительных чисел;
// - отрицательных чисел;
// - четных чисел;
//нулей. Реализуйте все подсчеты методами и напишите для них тесты.

import java.util.Random;

public class ArrayAnalysis {

    private int[] array;

    //конструктор для создания объекта с массивом
    public ArrayAnalysis(int size, int min, int max) {
        this.array = generateRandomArray(size, min, max);
    }

    // Метод для генерации случайного массива чисел от -10 до 10
    private int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    // Метод для подсчета положительных чисел
    public int countPositiveNumbers() {
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета отрицательных чисел
    public int countNegativeNumbers() {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета четных чисел
    public int countEvenNumbers() {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета нулей
    public int countZeros() {
        int count = 0;
        for (int num : array) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}

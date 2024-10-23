package homework30.number_sorting;

import java.util.Arrays;
import java.util.Collections;

public class DoubleArraySorting {
    public static void main(String[] args) {
        //создание массива типа Double с твоими числами
        Double[] numbers = {15.0, 947.0, -15.9, 897.0, 0.2, 99.0, -128.0, 343.0, 27.5, 500.0};

        //печать исходного массива
        System.out.println("Original array: ");
        for (Double number : numbers) {
            System.out.printf("%.2f ", number); //вывод с десятичной частью
        }
        System.out.println();

        //сортировка по возрастанию
        Arrays.sort(numbers);
        System.out.println("\nSorted in ascending order:");
        for (Double number : numbers) {
            System.out.printf("%.2f ", number); //вывод с десятичной частью
        }
        System.out.println();

        //сортировка по убыванию
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("\nSorted in descending order:");
        for (Double number : numbers) {
            System.out.printf("%.2f ", number); //вывод с десятичной частью
        }
        System.out.println();
    }
}

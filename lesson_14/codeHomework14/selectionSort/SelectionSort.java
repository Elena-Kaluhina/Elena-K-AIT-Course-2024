package selectionSort;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        //создаем массив из случайных чисел
        int[] array = new int[10];
        Random random = new Random();

        //заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //выводим массив до сортировки
        System.out.println("Array before sorting:");
        printArray(array);

        //сортируем массив по алгоритму Selection Sort
        selectionSort(array);

        //выводим массив после сортировки
        System.out.println("\nArray after sorting:");
        printArray(array);
    }

    //метод для сортировки массива по алгоритму Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        //проходим по каждому элементу массива
        for (int i = 0; i < n - 1; i++) {
            //минимальный текущий элемент
            int minIndex = i;

            //ищем наименьший элемент в оставшейся неотсортированной части массива
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            //оббмениваем минимальный элемент с текущим элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    //метод для вывода массива
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

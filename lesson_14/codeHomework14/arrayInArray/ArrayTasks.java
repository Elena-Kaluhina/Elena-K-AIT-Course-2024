package arrayInArray;
//Часть1. Заполните массив целыми числами от 1 до 100.
// Создайте второй массив с размером на 1 больше, чем
// имеющийся. Скопируйте первый массив в новый массив.
//Часть 2. Добавьте случайное целое число в интервале
// от 1 до 100 на случайное место в исходный массив.
//Часть 3(*). В полученном массиве найдите наиболее
// коротким способом, какое число было добавлено в массив.

import java.util.Random;

public class ArrayTasks {

    public static void main(String[] args) {

        //Task 1: Заполнение массива числами от 1 до 100
        int[] originalArray = new int[100];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = i + 1;
        }

        //выводим оригинальный массив
        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();


        //создаем новый массив с размером на 1 больше
        int[] newArray = new int[originalArray.length + 1];

        //копируем первый массив в новый массив
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Выводим новый массив после копирования
        System.out.println("\nNew array after copying original array (without added number):");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Task 2: Добавление случайного числа от 1 до 100 на случайную позицию

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; //случайное число от 1 до 100
        int randomPosition = random.nextInt(newArray.length); //случайная позиция в массиве

        //смещаем элементы вправо, чтобы освободить место для случайного числа
        for (int i = newArray.length - 1; i > randomPosition; i--) {
            newArray[i] = newArray[i - 1];
        }

        //вставляем случайное число на случайную позицию
        newArray[randomPosition] = randomNumber;

        //выводим новый массив с добавленным числом
        System.out.println("New array with inserted random number: " + randomNumber + " at position: " + randomPosition + " : ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Task 3: Находим, какое число было добавлено
        int addedNumber = findAddedNumber(originalArray, newArray);
        System.out.println("Added number: " + addedNumber);
    }

    //метод для поиска добавленного числа, сделала с помощью GPT
    public static int findAddedNumber(int[] originalArray, int[] newArray) {
        //находим добавленное число с помощью суммы
        int sumOriginal = 0;
        for (int num : originalArray) {
            sumOriginal += num;
        }

        int sumNew = 0;
        for (int num : newArray) {
            sumNew += num;
        }

        //разница между суммами — это добавленное число
        return sumNew - sumOriginal;
    }
}

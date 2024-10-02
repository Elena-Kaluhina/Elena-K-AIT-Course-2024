package homework11;
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс. Поставьте этот
// элемент в начало массива вместо имеющегося.

public class Task1 {
    public static void main(String[] args) {
        //задаём массив целых чисел
        int[] numbers = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        //выводим массив до изменений
        System.out.println("Array before modification: ");
        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        //переменные для хранения максимального значения и его индекса
        int max = numbers[0]; //изначально принимаем первый элемент за максимум
        int maxIndex = 0; //индекс первого элемента

        //поиск максимального элемента и его индекса
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i; //индекс максимального элемента
            }
        }

        //вывод максимального элемента и его индекса
        System.out.println("Maximum element: " + max);
        System.out.println("Maximum element index: " + maxIndex);

        //переносим максимальный элемент в начало массива
        int temp = numbers[0];    //временное сохранение первого элемента
        numbers[0] = max;         //переносим максимальный элемент на первое место
        numbers[maxIndex] = temp; //перемещаем первый элемент на место максимального элемента

        //выводим массив в консоль после изменений
        System.out.println("Array after modification: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

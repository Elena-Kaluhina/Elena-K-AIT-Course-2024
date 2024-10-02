package homework11;
//Написать метод, принимающий массив целых чисел,
// и "разворачивающий" его. Последний элемент
// становится нулевым, предпоследний, первым, и т. д.
// Подсказка: этот метод должен изменить полученный
// массив, а не распечатать его в обратном порядке.

public class Task4 {
    public static void main(String[] args) {
        //заполняем массив
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //вызываем метод для разворота массива
        reverseArray(numbers);//этот массив пока не изучали, сделан с помощью GPT

        //выводим изменённый массив
        System.out.println("Expanded array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    //метод для "разворота" массива
    public static void reverseArray(int[] numbers) {
        int n = numbers.length; //длина массива
        for (int i = 0; i < n / 2; i++) {
            //меняем местами элементы
            int temp = numbers[i]; //сохраняем временно элемент в temp (temporary)
            numbers[i] = numbers[n - 1 - i]; //ставим на его место элемент с конца
            numbers[n - 1 - i] = temp; //ставим в конец сохранённый элемент
        }
    }
}

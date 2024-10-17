package homework22.arrayElements.arrayMethods;
//Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
// - сумма всех элементов массива с нечётными индексами
// - поиск 5-го элемента в массиве
//разработайте тесты для этих методов
public class ArrayMethods {

    private int[] array;

    //конструктор для создания объекта с массивом
    public ArrayMethods(int[] array) {
        this.array = array;
    }

    //метод для суммы элементов массива с нечётными индексами
    public int sumOfOddIndexedElements() {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    //метод для поиска 5-го элемента в массиве
    public int findFifthElement() {
        if (array.length < 5) {
            throw new IllegalArgumentException("Array must have at least 5 elements");
        }
        return array[4]; //возвращаем элемент с индексом 4 (это 5-й элемент)
    }
}

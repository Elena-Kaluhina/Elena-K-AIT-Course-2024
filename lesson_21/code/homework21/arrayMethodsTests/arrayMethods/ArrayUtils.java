package homework21.arrayMethodsTests.arrayMethods;

//Разработайте тесты для методов обрабатывающих массивы:
// - поиск минимального (максимального) элемента
// - поиск индекса минимального (максимального) элемента

public class ArrayUtils {

    //метод для поиска минимального элемента в массиве
    public static int findMin(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //метод для поиска максимального элемента в массиве
    public static int findMax(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //метод для поиска индекса минимального элемента в массиве
    public static int findMinIndex(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    //метод для поиска индекса максимального элемента в массиве
    public static int findMaxIndex(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

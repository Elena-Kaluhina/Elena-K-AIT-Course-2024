package homework13;
//Написать метод copyOfArray. Метод принимает на вход массив
// целых чисел и целое число - длину нового массива newLength.
// Метод должен создать новый массив длиной newLength. В новый
// массив должны быть скопированы элементы из входящего массива:
// Пример: Исходный массив: {0, 1, 2, 3, 4, 5, 6} ->
// copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

import array_Methods.ArrayMethods;

public class CopyOfArray {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int[] newArray = copyOfArray(array, 3);
        System.out.print("New array: ");
        ArrayMethods.printArray(newArray);
    }

    public static int [] copyOfArray (int [] array,int newLength){

        int[] newArray = new int[newLength];
        for (int i = 0; i < array.length && i < newArray.length; i++) {
            newArray[i] = array[i];

        }
        return newArray;
    }

}

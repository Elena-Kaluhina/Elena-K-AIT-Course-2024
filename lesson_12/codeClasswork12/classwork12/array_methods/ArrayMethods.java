package classwork12.array_methods;

///  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел +
// - поиск искомого элемента

public class ArrayMethods {

    //fill array random numbers
    //a - left border, b -right border, n -quantity numbers
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);//датчик случайных чисел
        }
        return res;
    }


    //print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }


    //search in array
    public static boolean searchInArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                return true;
            }
        }
        return false;
    }//end of method
}//end of class

package homework12.arrayMethods;

// в моих методах я использую length и классический цикл for, если мне нужно работать с индексами массива
// и использую цикл for each ":", когда мне не нужно работать с индексами, а просто пройтись по элементам массива
// - это более простой и быстрый метод

public class ArrayMethods1 {

    // Method to add X percent to account balances
    public static double[] calculatePercent(double[] balances, double percent) {
        double[] updatedBalances = new double[balances.length];
        for (int i = 0; i < balances.length; i++) {
            updatedBalances[i] = balances[i] + (balances[i] * percent / 100);
        }
        return updatedBalances;
    }

    // Method to print a double array
    public static void printArrayDouble(double[] array) {
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }

    // Method to calculate the sum of all elements in an int array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the average of a double array
    public static double averageValue(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}

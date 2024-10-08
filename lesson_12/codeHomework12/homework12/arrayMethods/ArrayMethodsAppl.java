package homework12.arrayMethods;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        //test array account balances
        double[] balances = {1200, 1750, 2900, 3700};
        double percent = 5; //percent

        // calculatePercent method and print result
        double[] updateBalances = ArrayMethods1.calculatePercent(balances, percent);
        System.out.println("Balances with percents: ");
        ArrayMethods1.printArrayDouble(updateBalances);

        // sumArray method
        int[] numbers = {2, 4, 7, 9, 6};
        int sum = ArrayMethods1.sumArray(numbers);
        System.out.println("Sum of all elements in the array: " + sum);

        //averageValue method
        double[] values = {10, 15, 23, 37, 42};
        double average = ArrayMethods1.averageValue(values);
        System.out.println("Average value of array: " + average);
    }
}
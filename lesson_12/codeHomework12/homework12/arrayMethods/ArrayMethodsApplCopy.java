package homework12.arrayMethods;

import java.util.Scanner;

    public class ArrayMethodsApplCopy {

        public static void main(String[] args) {

            int[] myArray = ArrayMethodsCopy.fillArray(-10, 10, 20);

            ArrayMethodsCopy.printArray(myArray);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number for searching: ");
            int n = scanner.nextInt();

            boolean isInArray = ArrayMethodsCopy.searchInArray(myArray, n);
            System.out.println("Number " + n + " is in array: " + isInArray);

            System.out.println("===================================================");
            double[] money = {100, 200, 300, 150, 400};
            double[] newMoney = ArrayMethodsCopy.calculatePercent(money, 5.0);
            ArrayMethodsCopy.printArrayDouble(newMoney);

        }
    }

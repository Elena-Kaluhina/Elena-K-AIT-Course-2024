package cycles;

import java.util.Scanner;

/* Задача 2. Вводится положительное целое число,
найдите сумму его цифр. Пример: 1725, сумма цифр = 15 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a positive integer: ");//вводим положительное число
        int number = scanner.nextInt();
        int sumOfDigits = 0;//сумма чисел

        while (number > 0){
            int digit = number % 10;
            sumOfDigits += digit;
            number = number / 10;

        }//end of while

        System.out.println("Sum of digits: " + sumOfDigits);
        scanner.close();

    }//end of main
}//end of class

package classwork08;
//Пользователь вводит натуральное число n. Определите, является ли оно простым.
//Простое число - это такое число, которое делится **ТОЛЬКО** на себя и на 1.
//Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
//Обеспечьте защиту от ввода пользователем отрицательных чисел.
//31, 37
//15

import java.util.Scanner;


public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer positive number: ");

        int number = scanner.nextInt();

        //check correct number
        while (number <= 0) {
            System.out.println("Wrong input!");
            System.out.println("Try again, please!");
            number = scanner.nextInt();

        }//end of while

        boolean isPrime = isPrimeNumber(number);
        System.out.println(number + " is prime: " + isPrime);

    }//end of main

    private static boolean isPrimeNumber(int number) {
        int div = 2;
        while (div < number){
            if (number % div == 0){
                return false;
            }//end of if

            div++;

        }//end of while

        return true;

    }//end of boolean

}//end of class

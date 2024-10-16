package homework17.loopsWhile;
//С помощью цикла while написать программу, выводящую на экран результат умножения данного
// натурального числа n на все целые числа от 0 до n. Пример: для числа 3 результат будет
// 0, 3, 6, 9. А затем подсчитать сумму всех натуральных чисел от 0 до n.

import java.util.Scanner;

public class MultiplicationNaturalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a natural number n: ");

        int n = scanner.nextInt();
        int i = 0;

        System.out.println("Multiplication of " + n + " with numbers from 0 to " + n + ":");
        while (i <= n){
            System.out.println(n * i + " ");
            i++;
        }
        System.out.println();//переходим на новую строку

        //сброс переменной для подсчёта суммы
        i = 0;
        int sum = 0;

        //подсчёт суммы чисел от 0 до n
        while (i <= n){
            sum += i;
            i++;
        }
        //выводим сумму
        System.out.println("Sum of numbers from 0 to " + n + " is: " + sum);
    }
}

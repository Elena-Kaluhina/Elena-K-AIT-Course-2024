package homework17.loopsWhile;
//С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
//Пример:для числа n = 3 1 в кубе 1 2 в кубе 8 3 в кубе 27 ...

import java.util.Scanner;

public class CubeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number n: ");

        int n = scanner.nextInt();
        int number = 1;

        while (number <= n){
            int cube = number * number * number;
            System.out.println(number + " in cube is " + cube);
            number++;
        }
    }
}

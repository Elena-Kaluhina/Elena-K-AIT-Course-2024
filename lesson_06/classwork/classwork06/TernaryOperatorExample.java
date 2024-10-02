package classwork06;
//В программе задаются два целых числа.
//Найдите минимальное из них с помощью тернарного оператора.
//Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        int a = 500;
        int b = 200;

        int min = (a < b) ? a : b;//this is ternary operator
        System.out.println("Min = " + min);

        int max = (a > b) ? a : b;
        System.out.println("Max = " + max);

        //input data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        b = scanner.nextInt();

        min = minAB(a, b);

        System.out.println("Min = " + min);

    }//end of main

    //begin of the method
    public static int minAB(int a, int b){
        return (a < b) ? a : b;

    }//end of the method

}//end of class

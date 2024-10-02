package homework09;
/*
 Написать программу, выводящую на экран максимальное из трех
 целых чисел. Числа задайте самостоятельно внутри программы.
 Решите эту задачу с помощью if ... else
 */

public class MaximumIfElse {
    public static void main(String[] args) {

        //задаем числа
        double a = 17.1;
        double b = 17.01;
        double c = 17.001;

        //ищем максимальное число с помощью if...else
        double max;

        if (a >= b && a >= c){
            max = a;

        } else if (b >= a && b >= c) {
            max = b;

        }else {
            max = c;
        }

        System.out.println("Maximum number:" + max);

    }//end of main
}//end of class

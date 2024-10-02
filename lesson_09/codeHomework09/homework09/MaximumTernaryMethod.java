package homework09;
/*
Написать программу, выводящую на экран максимальное из трех
целых чисел. Числа задайте самостоятельно внутри программы.
Решите эту задачу с помощью if ... else и также с помощью
тернарного оператора.
 */
public class MaximumTernaryMethod {
    public static void main(String[] args) {
        //задаём данные для тернарного метода
        int a = 27;
        int b = 43;
        int c = 15;

        //ищем максимальное число
        int max = (a >= b) ? ( a >= c ? a : c) : (b >= c ? b : c);

        System.out.println("Maximum number: " + max);

    }//end of main
}//end of class

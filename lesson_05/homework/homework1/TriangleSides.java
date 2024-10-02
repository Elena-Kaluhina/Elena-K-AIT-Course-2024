package homework1;

public class TriangleSides {
    //Задать в программе три стороны треугольника. Проверить выполнимость неравенства треугольника -
    // любая из сторон должна быть меньше суммы двух других.
    // Сообщить результат - существует или нет треугольник с заданными сторонами.

    //begin of method
    private static boolean isTriangleValid (int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            //если условия выполнимы, тогда треугольник существут
            return true;

        } else {
            //если условия не выполнимы, тогда такого треугольника не существует
            return false;

        }
    }

    //begin of main
    public static void main(String[] args) {
        //пишем данные треугольника
        int a = 5;
        int b = 6;
        int c = 10;
        //проверяем существование треугольника
        if (isTriangleValid(a, b, c)) {
            System.out.println("Такой треугольник существует.");
        } else {
            System.out.println("Такой треугольник не существует  ");
        }
    }//end of main

}//end of class

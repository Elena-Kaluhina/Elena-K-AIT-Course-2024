package homework1;

public class ReturnMethod {
    //Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.
    //begin of method
    public static void main(String[] args) {
        //ввод переменных
        int a = 49;
        int b = 36;
        //здесь будет вызов метода
        int min = minimum (a, b);
        System.out.println("Minimum = " + min);

    }//end of main

    //здесть будет мой метод, который я буду вызывать внутри main
    private static int minimum (int a, int b){
        int min;
        if ( a <= b ){
            min = a;

        }else {
            min = b;
        }

        return min;
    }//end of the method

}//end of the class

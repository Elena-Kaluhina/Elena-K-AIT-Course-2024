package classwork1;

//Написать метод, возвращающий максимальное из двух целых чисел.

public class Maximum {
    public static void main(String[] args) {
        //ввод переменных
        int a = 45;
        int b = 74;
        //здесь будет вызов метода
        int max = maximum(a, b);
        System.out.println("Maximum = " + max);

    }
    //здесть будет мой метод, который я буду вызывать внутри main
    private static int maximum (int a, int b){
        int max;
        if ( a >= b ){
            max = a;

        }else {
            max = b;
        }

        return max;
    }
}

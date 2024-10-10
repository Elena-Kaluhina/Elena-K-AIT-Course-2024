package classwork20.application;

public class ArgAppl {
    public static void main(String[] args) {
        //публичный, статичный, ничего не возвращающий метод
        //наш метод main в круглых скобках получает аргументы
        //String[] args - это массив данных типа String
        //args - это имя массива
        //пример: int[] numbers = new int[10];

        String str1 = args[0];
        int n1 = Integer.parseInt(str1);

        String str2 = args[1];
        int n2 = Integer.parseInt(str2);

        System.out.println(str1 + " * " + str2 + " = " + n1 * n2);
                        //  20             50            20 * 50


    }
}

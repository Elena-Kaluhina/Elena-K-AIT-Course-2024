package classwork03;

//Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
//- какие переменные участвовали;
//- какие действия с ними выполнялись;
//- что получилось в результате.

public class MathOperation {
    public static void main(String[] args) {

        int x = 38;
        int y = 63;

        System.out.println(x + y);

        int res = x + y;

        System.out.println("x = " + x + " складываем с y = " + y + " получаем " + res);

        res = y - x;

        System.out.println("x = " + x + " вычитаем с y = " + y + " получаем " + res);
        System.out.println("y" + y + " - x" + x + " = " + res);

        res = x - y;

        System.out.println("x" + x + " - y" + y + " = " + res);

        // деление мы делаем / целых чисел, дает целую часть и не дает десятков и остатков

        res = y / x;
        System.out.println("y" + y + " / x" + x + " = " + res);

        // деление % целых чисел дает остаток деления

        res = y % x;
        System.out.println("y" + y + " % x" + x + " = " + res);

    }//end of main



}//end of class

package homework20.tasks;
//Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных
// типов: byte, short, char, int, long, float, double Типы как объекты String должны браться
// из аргументов основной функции main. Если в аргументах нет никакого типа (строка с аргументами
// пуста), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short,
// long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести
// сообщение: Неверный тип.

import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //выводим информацию для всех типов, если аргументы отсутствуют
        if (args.length == 0){
            printMinMax("byte");
            printMinMax("short");
            printMinMax("char");
            printMinMax("int");
            printMinMax("long");
            printMinMax("float");
            printMinMax("double");
        }else {
            //перебираем все аргументы
            for (String arg : args){
                printMinMax(Arrays.toString(args));
            }
        }
    }
    //метод для вывода минимальных и максимальных значений примитивных типов
    public static void printMinMax(String type){
        switch (type.toLowerCase()){
            case "byte":
                System.out.println("byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
                break;
            case "short":
                System.out.println("short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
                break;
            case "char":
                System.out.println("char: Min = " + (int)Character.MIN_VALUE + ", Max = " + (int)Character.MAX_VALUE);
                break;
            case "int":
                System.out.println("integer: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
                break;
            case "long":
                System.out.println("long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
                break;
            case "float":
                System.out.println("float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
                break;
            case "double":
                System.out.println("double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
                break;
            default:
                //если тип неправильный, выводим сообщение об ошибке
                System.out.println("Incorrect type: " + type);
                break;
        }
    }
}

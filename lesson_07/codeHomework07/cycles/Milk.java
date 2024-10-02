package cycles;
/* Задача 1. Программа получает на вход строку и
число повторений этой строки. Программа должна вывести
эту строку нужное количество раз.
Пример: строка - "молоко", кол-во раз 3 молоко молоко молоко */

import java.util.Scanner;

public class Milk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//создаем сканнер

        System.out.println("Input the word: ");
        String inputString = scanner.nextLine();

        System.out.println("Input the number of repetitions: ");
        int repeatCount = scanner.nextInt();

        int count = 0;//стартуем с 0 и добавляем 1 используя цикл while

        while (count < repeatCount){
            System.out.println(inputString + " ");/*если мы уберём буквы ln после слова print
                                                   тогда слова будут выводиться в одну строку,
                                                   а не в каждой строке отдельно*/
            count++;//увеличиваем счётчик на 1

        }//end of while
scanner.close();
    }//end of main
}//end of class

package homework15;
/*
Напишите программу, которая запрашивает строку от пользователя и затем:
- сообщает сколько слов в строке
- сообщает сколько букв (символов) в строке
- печатает строку задом наперед, начиная с последнего слова.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //запрашиваем строку от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String input = scanner.nextLine();

        //сообщаем количество слов в строке
        String[] words = input.trim().split("\\s+"); //разделяем строку по пробелам
        int wordCount = words.length;
        System.out.println("String number of words: " + wordCount);
        //метод split ("\\s+") делит строку по одному или нескольким пробелам и это позволяет
        //получить массив слов, а words.length возвращает количество слов в строке


        //сообщаем количество букв (символов), в строке (без пробелов)
        int letterCount = input.replaceAll("\\s+", "").length(); //убираем все пробелы
        System.out.println("Number of letters (symbols) in the string: " + letterCount);
        //метод replaceAll("\\s+","") удаляет все пробелы в строке
        //методом length считаем количество символов


        //печатаем строку задом наперёд, начиная с последнего слова
        System.out.println("String backwards: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");

        }
    }
}

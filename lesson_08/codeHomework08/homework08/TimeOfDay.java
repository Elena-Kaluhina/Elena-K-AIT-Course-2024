package homework08;
/*
Определение времени суток. Напишите программу, которая
принимает на вход текущий час (от 0 до 23) и выводит приветствие
в зависимости от времени суток (утро, день, вечер, ночь).
 */

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it? Input please time in 24H format, please.");
        int time = scanner.nextInt();

        switch (time){

            case 4, 5, 6, 7, 8, 9, 10 -> System.out.println("Good morning!");
            case 11, 12, 13, 14, 15, 16 -> System.out.println("Good afternoon!");
            case 17, 18, 19, 20 -> System.out.println("Good evening!");
            case 21, 22, 23 -> System.out.println("It's time to sleep, I wish you good night!");
            case 24, 0, 1, 2, 3 -> System.out.println("It's nighttime and you should be asleep!");

        }//end of switch

    }//end of main
}//end of class

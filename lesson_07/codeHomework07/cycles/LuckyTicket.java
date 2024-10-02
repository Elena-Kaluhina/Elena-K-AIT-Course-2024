package cycles;
/*
Вводится шестизначное число (номер автобусного билета).
Определите, является ли этот билет "счастливым"
(сумма первых трех цифр равна сумме трех последних цифр).
 */

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the six-digit ticket number: ");
        int ticketNumber = scanner.nextInt();

        if (ticketNumber < 100000 || ticketNumber > 999999) {
            System.out.println("Wrong input: Input the six-digit ticket number: ");
            return;//завершаем программу, если число не шестизначное
        }
        int firstPart = ticketNumber / 1000; //первые три цифры
        int secondPart = ticketNumber % 1000; //последние три цифры

        int sumOfFirstPart = (firstPart / 100) + (firstPart / 10 % 10) + (firstPart % 10);
        //считаем сумму первых трех цифр

        int sumOfSecondPart = (secondPart / 100) + (secondPart / 10 % 10) + (secondPart % 10);
        //считаем сумму последних трех цифр

        if (sumOfFirstPart == sumOfSecondPart) {//проверяем или билет счастливый
            System.out.println("Lucky ticket!");
        } else {
            System.out.println("Not a lucky ticket!");

        }//end of else



    }//end of main

}//end of class

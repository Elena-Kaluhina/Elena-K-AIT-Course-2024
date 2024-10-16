package homework17.repetition_tasks;
//Написать программу, определяющую, является ли год високосным.
// Значение года задается в программе или вводится пользователем
// с клавиатуры. Для того чтобы год был високосным, он должен:
// делится без остатка на 4 и, либо не должен делится без остатка
// на 100, либо если он делится на 100, то он должен делится также
// на 400. Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check: ");

        int year = scanner.nextInt();

        if (isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not leap year.");
        }

        System.out.println("\nChecking specific years: ");
        checkYear(1700);
        checkYear(1800);
        checkYear(1900);
        checkYear(2000);
    }
    public static boolean isLeapYear(int year){
        //год является високосным, если он делится на 4, но не делится на 100 или делится на 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void checkYear( int year){
        if(isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not leap year.");
        }
    }
}

package homework06;
//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class EmployeesSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//создаем объект сканнер для ввода данных с клавы

        double baseSalary = 500.0;// базовая зарплата
        System.out.println("Enter the number of years of service: ");

        int yearsWorked = scanner.nextInt();// вводим количество лет

        double finalSalary = calculateBonus(baseSalary, yearsWorked);
        System.out.println("Total salary including allowance: " + finalSalary + " Dollars. ");

        scanner.close();

    }//end of main

    private static double calculateBonus(double baseSalary, int yearsWorked){

        double bonusPercent = 0.0;
        if (yearsWorked >= 15){
            bonusPercent = 150.0;//бонус 150% за 15 лет и более работы

        } else if (yearsWorked >= 10) {
            bonusPercent = 100.0;//бонус 100% за 10 лет и более работы

        } else if (yearsWorked >= 5) {
            bonusPercent = 50.0;//бонус 100% за 5 лет и более работы

        } else if (yearsWorked >=3) {
            bonusPercent = 10.0;//бонус 100% за 3 года и более работы

        }
        return baseSalary + (baseSalary * bonusPercent / 100 );

    }//end of method
}//end of class

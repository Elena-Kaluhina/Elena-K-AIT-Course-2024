package homework09;

import java.util.Scanner;

/*
В программе задаются часы, минуты и секунды. Нужно вывести общее количество секунд,
прошедших с начала суток. Вычисление произведите в методе,
который получает на вход часы, минуты и секунды.
 */
public class SecondsMinutesHours {

   public static int calculateSeconds(int hours, int minutes, int seconds){

       return (hours * 3600) + (minutes * 60) + seconds;//переводим часы и минуты в секунды + секунды

   }//end of int

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hours: ");
        int hours = scanner.nextInt();

        System.out.println("Enter the minutes: ");
        int minutes = scanner.nextInt();

        System.out.println("Enter the seconds: ");
        int seconds = scanner.nextInt();

        int totalSeconds = calculateSeconds(hours, minutes, seconds);

        System.out.println("Total seconds since the start of the day: " + totalSeconds);

   }//end of main

}//end of class


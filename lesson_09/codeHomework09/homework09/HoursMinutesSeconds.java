package homework09;
/*
Программа запрашивает у пользователя количество секунд,
прошедших с начала суток. Нужно вывести часы, минуты и
секунды. Проверьте, что число введенных пользователем
секунд не более 86 400.
 */

import java.util.Scanner;

public class HoursMinutesSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the number of seconds that have elapsed" +
                " since the beginning of the day: ");
        int totalSeconds = scanner.nextInt();

        if (totalSeconds < 0 || totalSeconds > 86400) {
            System.out.println("Error: the number of seconds must be in " +
                    " the range from 0 to 86 400.");

        } else {
            //рассчитываем часы, минуты и секунды
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.println("Total time: " + hours + " hours " + minutes +
                    " minutes " + seconds + " seconds");

        }//end of if

    }//end of main
}//end of class

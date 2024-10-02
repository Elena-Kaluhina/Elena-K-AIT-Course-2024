package homework09;

import java.time.LocalTime;

public class Seconds {
    /*
    В программе задаются часы, минуты и секунды. Нужно вывести общее количество секунд,
    прошедших с начала суток. Вычисление произведите в методе,
    который получает на вход часы, минуты и секунды.
     */
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        int hours = currentTime.getHour();
        int minutes = currentTime.getMinute();
        int seconds = currentTime.getSecond();

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Current time: " + currentTime);
        System.out.println("Total seconds since the start of the day: " + totalSeconds);
    }
}

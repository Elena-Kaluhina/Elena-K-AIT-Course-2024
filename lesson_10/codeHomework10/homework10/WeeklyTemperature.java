package homework10;
/*
Собрать в массив данные о дневной температуре в вашем городе за
прошедшую неделю. Выведите на печать температуру, которая была во
вторник и затем в четверг. Найти среднюю температуру за прошлую неделю.
 */

import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {

        double [] temperatures = {22.5, 23, 24.8, 23.5, 27, 23.4, 21};//создаем массив данных за неделю
        //индексы                 [1]  [2]  [3]   [4]  [5]  [6]  [7]
        //[1] - понедельник; [2] - вторник; [3] - среда; [4] - четверг; [5] - пятница
        //[6] - суббота; [7] - воскресенье

        System.out.println("Tuesday's temperature is " + temperatures[1] + " degree. ");//[1] - индекс вторника
        System.out.println("Thursday's temperature is " + temperatures[3] + " degree ");//[3] - индекс четверга

        //находим среднюю температуру за неделю
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            sum += temperatures[i];//суммируем все температуры за неделю
        }

        double average = sum / 7;//рассчитываем средний показатель за неделю
        System.out.println("The average temperature for the week: " + average + " degree. ");
    }
}

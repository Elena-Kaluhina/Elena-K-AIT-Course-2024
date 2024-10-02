package homework11;
// У стрелка есть 10 попыток поразить мишень.
// Смоделируйте 10 выстрелов с помощью датчика
// случайных чисел. Ответьте на вопрос, сколько
// очков набрал стрелок? Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        //создаём генератор
        Random random = new Random();

        //задаём данные: количество выстрелов,
        //количество очков и попаданий в центр
        int numberOfShoots = 10;
        int totalPoint = 0;
        boolean hitsInCenter = false;

        //10 выстрелов
        for (int i = 1; i <= numberOfShoots ; i++) {

        //создаем генератор случайных чисел и полученных очков за выстрел
        int points = random.nextInt(10) + 1;
        System.out.println("Shoot " + i + ": " + points + " points.");

        //суммируем очки выстрелов
        totalPoint += points;

        //проверяем попал ли стрелок в центр
        if (points == 10) {
            hitsInCenter = true;
        }
        }
        System.out.println("Total points:" + totalPoint);

        //проверяем, если стрелок попал в центр мишени
        if (hitsInCenter){
            System.out.println("Hitting the center!");
        }else {
            System.out.println("No hitting the center!");
        }
    }
}

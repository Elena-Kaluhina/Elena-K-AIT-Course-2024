package array;
/*
//Смоделируйте бросок игрального кубика 20 раз.
Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?
 */

import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random random = new Random();// создаём объект

        int[] toss = new int[20];//toss - жребий

        // fill in
        for (int i = 0; i < toss.length; i++) {
            // вызов датчика случайных чисел
            int n = random.nextInt(6) + 1; // диапазон от 0 до 5 (5 включено) + 1, чтобы сдвинуть от 1 до 6
            System.out.print(n + " ");
        }
        System.out.println();
    }

}


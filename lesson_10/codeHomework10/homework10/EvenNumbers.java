package homework10;
/*
Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
Распечатать массив в порядке возрастания, затем в порядке убывания.
*/

import java.util.Arrays;
import java.util.Collections;

public class EvenNumbers {

    public static void main(String[] args) {

        Integer[] evenNumbers = new Integer[26];//26 - это количество четных чисел от 0 до 50

        //заполняем массив четными числами
        int index = 0;
        for (int i = 0; i <= 50; i += 2) {
            evenNumbers[index] = i;
            index++;
        }
        //возрастающий массив
        System.out.println("Even numbers from 0 to 50 in ascending order ");
        System.out.println(Arrays.toString(evenNumbers));

        //убывающий массив
        Arrays.sort(evenNumbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(evenNumbers));
    }
}

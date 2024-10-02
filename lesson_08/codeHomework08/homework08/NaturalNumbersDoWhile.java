package homework08;
/*
Распечатайте все натуральные числа меньшие 200 и кратные 13.
Используйте циклы while и do while.
 */

public class NaturalNumbersDoWhile {
    public static void main(String[] args) {

        int number = 13;

        do {
            System.out.print(number + " ");
            number += 13;//увеличиваем на 13

        } while (number < 200);

    }//end of main
}//end of class

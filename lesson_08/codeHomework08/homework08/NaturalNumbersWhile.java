package homework08;
/*
Распечатайте все натуральные числа меньшие 200 и кратные 13.
Используйте циклы while и do while.
 */
public class NaturalNumbersWhile {
    public static void main(String[] args) {

        int number = 13;

        while (number < 200){// числа кратные 13 и меньше 200
            System.out.println(number);
            number += 13;//увеличиваем число на 13

        }//end of while

    }//end of main
}//end of class

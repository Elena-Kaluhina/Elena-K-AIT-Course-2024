package homework08;
/*
Распечатайте все натуральные числа меньшие 200 и кратные 13.
Используйте циклы while и do while.
 */

public class NaturalNumbers {
    public static void main(String[] args) {
        int number = 10;
        while (number < 200){
            if(number % 13 == 0){
                System.out.print(number + " ");//если добавим ln каждое число будет выводиться в новую строку
            }//end of if

            number++;

        }//end of while

        System.out.println();//переход на новую строку
        System.out.println("Done!");

    }//end of main
}//end of class

package cycles;
/*
В первый день спортсмен пробежал s километров, а затем он каждый
день увеличивал пробег на 10 % от предыдущего значения. Определите
номер того дня, на который пробег спортсмена составит не менее
target километров. Программа получает на вход действительные
числа s и target и должна вывести одно натуральное число.
 */

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the mileage on the 1st day: ");/*3.2 км вводить в консоли нужно через
                                                                  запятую (3,2), иначе выдает ошибку */
        double s = scanner.nextDouble();//для десятичного числа

        System.out.println("Input the target mileage: ");
        double target = scanner.nextDouble();//для десятичного числа

        int day = 1;

        while (s < target){

            s = s + s * 0.1;//0.1 - это 10 %
            day++;

        }//end of while

        System.out.println("On the " + day + " day, the athlet's mileage will be no less then "
        + target +  " km.");

        scanner.close();

    }//end of main
}//end of class

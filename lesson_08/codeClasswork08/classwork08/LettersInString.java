package classwork08;
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.

import java.util.Scanner;

public class LettersInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();//еще раз string написать мы не можем, поэтому пишем
                                        //str, st, s or another one, for example stroka, word etc

        System.out.println(str);

        int l = str.length();
        System.out.println(l);
        int i = 0;

        // alena
        // самый первый символ будет 0, а потом по возрастающей
        //и получается 01234

        while ( i < l){

            System.out.println(str.charAt(i));//если после print стоит ln, тогда каждая буква в новой строке
                                              //если ln не стоит, тогда все пишется в одной строке
            i++; // i = i + 1

        }//end of while


    }//end of main
}//end of class

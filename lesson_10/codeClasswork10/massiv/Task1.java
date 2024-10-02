package massiv;
/*
Создайте массив и заполните его целыми числами от 1 до 20.
 */

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = new int[20];//length of array(массив)

        //numbers[0] - 1st element of array
        //numbers.length = 20
        //number[numbers, length -1]

        //fill in
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");

        }//end of for

        System.out.println();
        //print sout
        System.out.println(numbers);//link to array (ссылка на массив)

    }//main

}//class

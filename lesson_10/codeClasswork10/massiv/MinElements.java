package massiv;
/*
Создайте массив, который содержит возраст студентов группы.
- какой возраст максимальный?
- какой возраст минимальный?
 */

public class MinElements {
    public static void main(String[] args) {

        int[] ages = {47, 49, 37, 47, 52, 44, 34, 38, 59, 43, 18, 35, 41, 18};

        int min = ages[0];

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < min){

                min = ages[i];

            }

        }

        System.out.println("Min age = " + min);
        System.out.println();



        int max = ages[0];

        for (int i = 0; i < ages.length ; i++) {
            if (ages[i] > max){

                max = ages[i];

            }
        }

        System.out.println("Max age: = " + max);
        System.out.println();

        int max1 = ages[0];

        for (int i = ages.length - 1; i >= 0; i--) {
            if (ages[i] > max1){

                max1 = ages[i];

            }
        }

        System.out.println("Max age: " + max1);
    }
}

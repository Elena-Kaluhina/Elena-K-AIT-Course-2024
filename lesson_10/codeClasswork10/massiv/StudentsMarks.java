package massiv;
/*
Имеются оценки абитуриента из его аттестата, всего 12 оценок.
Найдите средний балл абитуриента.
 */

public class StudentsMarks {
    public static void main(String[] args) {

        int[] marks = {2, 4, 3, 1, 5, 2, 6, 3, 5, 2, 4, 1};//marks.length объявление массива в явном виде
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }//end of for

        System.out.println("Sum = " + sum);

        double averageMark = (double) sum / marks.length;//casting
        System.out.println("Average mark = " + averageMark);

    }//main
}//class
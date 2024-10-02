package classwork08;
//Распечатать в консоли таблицу умножения от 1 до 10.

public class MiltiplicationTable {
    public static void main(String[] args) {
        //цикл в цикле
        int i = 1, j = 1;

        while ( i < 11){//после while обязательно и всегда ставятся фигурные скобки
            while ( j < 11 ){

                System.out.print(i + " x " + j + " = " + (i * j) + " | ");//будет выводиться 1 х 1 = 1
                j++;

            }//end of while j

            j = 1;
            i++;
            System.out.println();//next line

        }//end of while i

    }//end of main
}//end of class

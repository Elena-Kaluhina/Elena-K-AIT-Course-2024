package classwork30.sorting_integer;

import java.util.Arrays;

public class SortingInteger {

    public static void main(String[] args) {

        Integer[] numbers = {
                -100,
                2,
                Integer.MAX_VALUE,
                2,
                15,
                35,
                Integer.MIN_VALUE,
                71
        };

        Arrays.sort(numbers, (n1, n2) -> Integer.compare(n2, n1)); //распечатает от большего к меньшему
        //Arrays.sort(numbers); //распечатает от меньшего к большему
        System.out.println(Arrays.toString(numbers));

        int index = 0;
        for (Integer i : numbers){
            System.out.println(i + " " + index + " | ");
            index++;

        }

    }
}

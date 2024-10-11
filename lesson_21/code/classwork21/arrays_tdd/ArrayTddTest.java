package classwork21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {

    ArrayTdd arrayTdd;  //объект в классе
    int[] array = {10, -10, 20, -15, 45, 23, 46};  //создаём массив

    @BeforeEach
    void setUp() {
        arrayTdd = new ArrayTdd(array); // взяли конструктор, который мы написали в ArrayTdd
    }

    @Test
    void countPositive() {
        //expected
        int expected = 5;

       //actual
        int actual = arrayTdd.countPositive(array);

        //assert equals
        assertEquals(expected, actual, "Bad info:");
    }
}
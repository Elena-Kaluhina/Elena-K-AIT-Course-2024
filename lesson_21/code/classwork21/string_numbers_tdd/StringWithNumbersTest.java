package classwork21.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; //object - это наш объект который мы будем тестить

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 321 10"); //454 - метод должен вернуть этот результат
    }

    @Test
    void sumOfNumbersInStringTest(){
        String str = "123 321 10";
        int expected = 454;
        int actual = stringWithNumbers.sumOfNumbersInString(str);
        assertEquals(expected, actual);
        //или можно сделать одной строкой ↓
        //stringWithNumbers.sumOfNumbersInString(str);

    }

}
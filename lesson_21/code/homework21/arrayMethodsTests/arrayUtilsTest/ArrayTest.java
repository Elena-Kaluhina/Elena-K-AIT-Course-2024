package homework21.arrayMethodsTests.arrayUtilsTest;

import homework21.arrayMethodsTests.arrayMethods.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {

    //тест для метода поиска минимального элемента
    @Test
    public void testFindMin(){
        int[] array = {9, 3, 5, 7, 4, 2, 1};
        assertEquals(1, ArrayUtils.findMin(array));
    }

    //тест для метода поиска максимального элемента
    @Test
    public void testFindMax(){
        int[]array = {9, 3, 5, 7, 4, 2, 1};
        assertEquals(9, ArrayUtils.findMax(array));
    }

    //тест для метода поиска индекса минимального элемента
    @Test
    public void testFindMinIndex(){
        int[] array = {9, 3, 5, 7, 4, 2, 1};
        assertEquals(6, ArrayUtils.findMinIndex(array));
    }

    //тест для метода поиска индекса максимального эдемента
    @Test
    public void testFindMaxIndex(){
        int[] array = {9, 3, 5, 7, 4, 2, 1};
        assertEquals(0, ArrayUtils.findMaxIndex(array));
    }

    //тест для метода поиска минимального элемента в пустом массиве
    @Test
    public void testFindMinEmptyArray(){
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMin(array));
    }

    //тест для метода поиска максимального элемента в пустом массиве
    @Test
    public void testFindMaxEmptyArray(){
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(array));
    }

    //тест для метода поиска индекса максимального элемента в пустом массиве
    @Test
    public void testFindMaxIndexEmptyArray(){
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMaxIndex(array));
    }
}

//testFindMin и testFindMax проверяют, что методы возвращают правильные минимальные и максимальные значения массива
//testFindMinIndex и testFindMaxIndex проверяют индексы минимальных и максимальных значений для того же массива
//testFindMinEmptyArray и testFindMaxEmptyArray проверяют, чтобы методы выбрасывали исключения IllegalArgumentException,
//если массив пустой. Все методы используют статический импорт из JUnit, чтобы сделать код более читаемым и чистым

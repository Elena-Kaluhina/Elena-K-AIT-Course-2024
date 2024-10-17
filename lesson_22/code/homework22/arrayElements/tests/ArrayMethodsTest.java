package homework22.arrayElements.tests;

import static org.junit.jupiter.api.Assertions.*;
import homework22.arrayElements.arrayMethods.ArrayMethods;
import org.junit.jupiter.api.Test;

public class ArrayMethodsTest {

    @Test
    public void testSumOfOddIndexedElements() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayMethods arrayMethods = new ArrayMethods(testArray);
        int result = arrayMethods.sumOfOddIndexedElements();
        assertEquals(20, result); // 2 + 4 + 6 + 8 = 20
    }

    @Test
    public void testFindFifthElement() {
        int[] testArray = {1, 2, 3, 4, 9, 6, 7, 8, 5};
        ArrayMethods arrayMethods = new ArrayMethods(testArray);
        int result = arrayMethods.findFifthElement();
        assertEquals(9, result); // 5-й элемент это 9
    }

    @Test
    public void testFindFifthElementWithSmallArray() {
        int[] testArray = {1, 2, 3};
        ArrayMethods arrayMethods = new ArrayMethods(testArray);
        assertThrows(IllegalArgumentException.class, () -> arrayMethods.findFifthElement());
    }
}


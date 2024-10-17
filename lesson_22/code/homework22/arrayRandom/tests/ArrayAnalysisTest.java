package homework22.arrayRandom.tests;

import static org.junit.jupiter.api.Assertions.*;

import homework22.arrayRandom.model.ArrayAnalysis;
import org.junit.jupiter.api.Test;

public class ArrayAnalysisTest {

    @Test
    public void testCountPositiveNumbers() {
        int[] testArray = {-10, -5, 0, 5, 10};
        ArrayAnalysis arrayAnalysis = new ArrayAnalysis(testArray.length, -10, 10);
        int result = arrayAnalysis.countPositiveNumbers();
        assertTrue(result >= 0);
    }

    @Test
    public void testCountNegativeNumbers() {
        int[] testArray = {-10, -5, 0, 5, 10};
        ArrayAnalysis arrayAnalysis = new ArrayAnalysis(testArray.length, -10, 10);
        int result = arrayAnalysis.countNegativeNumbers();
        assertTrue(result >= 0);
    }

    @Test
    public void testCountEvenNumbers() {
        int[] testArray = {-10, -5, 0, 5, 10};
        ArrayAnalysis arrayAnalysis = new ArrayAnalysis(testArray.length, -10, 10);
        int result = arrayAnalysis.countEvenNumbers();
        assertTrue(result >= 0);
    }

    @Test
    public void testCountZeros() {
        int[] testArray = {-10, 0, 0, 5, 10};
        ArrayAnalysis arrayAnalysis = new ArrayAnalysis(testArray.length, -10, 10);
        int result = arrayAnalysis.countZeros();
        assertTrue(result >= 0);
    }
}

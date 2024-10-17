package homework23.primeChecker.test;

import static org.junit.jupiter.api.Assertions.*;

import homework23.primeChecker.model.PrimeChecker;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    @Test
    public void testIsPrimeForPrimeNumbers() {
        assertTrue(PrimeChecker.isPrime(2), "2 is a prime number");
        assertTrue(PrimeChecker.isPrime(3), "3 is a prime number");
        assertTrue(PrimeChecker.isPrime(17), "17 is a prime number");
    }

    @Test
    public void testIsPrimeForNonPrimeNumbers() {
        assertFalse(PrimeChecker.isPrime(1), "1 is not a prime number");
        assertFalse(PrimeChecker.isPrime(4), "4 is not a prime number");
        assertFalse(PrimeChecker.isPrime(9), "9 is not a prime number");
    }

    @Test
    public void testNegativeAndZeroNumbers() {
        assertFalse(PrimeChecker.isPrime(-5), "-5 is not a prime number");
        assertFalse(PrimeChecker.isPrime(0), "0 is not a prime number");
    }
}

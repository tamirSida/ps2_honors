import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDivZeroDividend() {
        int[] result = division.div(0, 23);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    public void testDivZeroDivisor() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            division.div(8, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testDivEqualDividendAndDivisor() {
        int[] result = division.div(23, 23);
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    public void testDivDividendLessThanDivisor() {
        int[] result = division.div(8, 23);
        assertArrayEquals(new int[]{0, 8}, result);
    }

    @Test
    public void testDivDividendGreaterThanDivisor() {
        int[] result = division.div(50, 23);
        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    public void testIsOdd() {
        assertTrue(division.isOdd(3));
        assertFalse(division.isOdd(4));
    }
}
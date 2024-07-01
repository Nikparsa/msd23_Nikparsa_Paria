package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8, calc.add(5, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-4, calc.add(-2, -2));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-2, calc.subtract(-1, 1));
        assertEquals(0, calc.subtract(-2, -2));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(5, 3));
        assertEquals(-1, calc.multiply(-1, 1));
        assertEquals(4, calc.multiply(-2, -2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-1, calc.divide(-1, 1));
        assertEquals(1, calc.divide(-2, -2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
    }
    @Test
    public void testFactorialNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));
        assertEquals(1, calc.factorial(1));

        // Test für negative Eingabe
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
        assertEquals("Negative input for factorial", exception.getMessage());
    }
}

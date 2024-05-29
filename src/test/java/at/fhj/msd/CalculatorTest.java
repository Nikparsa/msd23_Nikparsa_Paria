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
        assertEquals(8, calc.add(5, 3)); // 5 + 3 = 8
        assertEquals(0, calc.add(-1, 1)); // -1 + 1 = 0
        assertEquals(-4, calc.add(-2, -2)); // -2 + (-2) = -4
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3)); // 5 - 3 = 2
        assertEquals(-2, calc.subtract(-1, 1)); // -1 - 1 = -2
        assertEquals(0, calc.subtract(-2, -2)); // -2 - (-2) = 0
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(5, 3)); // 5 * 3 = 15
        assertEquals(-1, calc.multiply(-1, 1)); // -1 * 1 = -1
        assertEquals(4, calc.multiply(-2, -2)); // -2 * (-2) = 4
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3)); // 6 / 3 = 2
        assertEquals(-1, calc.divide(-1, 1)); // -1 / 1 = -1
        assertEquals(1, calc.divide(-2, -2)); // -2 / (-2) = 1

    }
    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));
        assertEquals(0, calc.factorial(-3));
    }
}

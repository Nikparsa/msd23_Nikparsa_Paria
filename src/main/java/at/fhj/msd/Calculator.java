package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple calculator class that provides basic arithmetic operations.
 */
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Adds two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of num1 and num2.
     */
    public double add(double num1, double num2) {
        logger.debug("add() - Parameters: num1={}, num2={}", num1, num2);
        return num1 + num2;
    }

    /**
     * Subtracts two numbers.
     *
     * @param num1 The first number (minuend).
     * @param num2 The second number (subtrahend).
     * @return The difference of num1 and num2.
     */
    public double subtract(double num1, double num2) {
        logger.debug("subtract() - Parameters: num1={}, num2={}", num1, num2);
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of num1 and num2.
     */
    public double multiply(double num1, double num2) {
        logger.debug("multiply() - Parameters: num1={}, num2={}", num1, num2);
        return num1 * num2;
    }

    /**
     * Divides two numbers.
     *
     * @param num1 The numerator.
     * @param num2 The denominator.
     * @return The result of dividing num1 by num2.
     * @throws ArithmeticException if division by zero is attempted.
     */
    public double divide(double num1, double num2) {
        logger.debug("divide() - Parameters: num1={}, num2={}", num1, num2);
        if (num2 == 0) {
            logger.error("divide() - Division by zero: num1={}, num2={}", num1, num2);
            throw new IllegalArgumentException("Division by zero");
        }
        return num1 / num2;
    }

    /**
     * Computes the factorial of a number.
     *
     * @param n The number for which factorial is computed.
     * @return The factorial of n.
     * @throws IllegalArgumentException if n is negative.
     */
    public int factorial(int n) {
        logger.debug("factorial() - Parameter: n={}", n);
        if (n < 0) {
            logger.error("factorial() - Negative input: n={}", n);
            throw new IllegalArgumentException("Negative input for factorial");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

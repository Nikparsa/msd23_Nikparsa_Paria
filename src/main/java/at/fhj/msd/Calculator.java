package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double num1, double num2) {
        logger.debug("add() - Parameters: num1={}, num2={}", num1, num2);
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        logger.debug("subtract() - Parameters: num1={}, num2={}", num1, num2);
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        logger.debug("multiply() - Parameters: num1={}, num2={}", num1, num2);
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        logger.debug("divide() - Parameters: num1={}, num2={}", num1, num2);
        if (num2 == 0) {
            logger.error("divide() - Division by zero");
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    public int factorial(int n) {
        logger.debug("factorial() - Parameter: n={}", n);
        if (n < 0) {
            logger.error("factorial() - Negative input: n={}", n);
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

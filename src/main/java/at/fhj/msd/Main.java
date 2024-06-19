package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {
        logger.info("Starting application");

        Calculator calculator = new Calculator();

        try {
            double resultAddition = calculator.add(3, 5);
            System.out.println("Result of addition: " + resultAddition);

            double resultSubtraction = calculator.subtract(18, 12);
            System.out.println("Result of subtraction: " + resultSubtraction);

            double resultMultiplication = calculator.multiply(25, 57);
            System.out.println("Result of multiplication: " + resultMultiplication);

            double resultDivision = calculator.divide(456, 12);
            System.out.println("Result of division: " + resultDivision);
        } catch (ArithmeticException e) {
            logger.error("Exception occurred: ", e);
        }

        logger.info("Application finished");
    }
}

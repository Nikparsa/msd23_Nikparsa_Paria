package at.fhj.msd;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        double resultAddition = calculator.add(3, 5);
        System.out.println("Result of addition: " + resultAddition);

        double resultSubtraction = calculator.subtract(18, 12);
        System.out.println("Result of subtraction: " + resultSubtraction);

        double resultMultiplication = calculator.multiply(25, 57);
        System.out.println("Result of multiplication: " + resultMultiplication);

        double resultDivision = calculator.divide(456, 12);
        System.out.println("Result of division: " + resultDivision);
    }
}

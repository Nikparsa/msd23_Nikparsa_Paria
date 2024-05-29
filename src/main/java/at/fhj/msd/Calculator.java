package at.fhj.msd;

public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }


    public double subtract(double num1, double num2) {
        return num1 - num2;
    }


    public double multiply(double num1, double num2) {
        return num1 * num2;
    }


    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public int factorial(int n) {
        if(n < 0)
            return 0;
        else if (n == 0 || n == 1) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

}

package BinaryOperator;

import java.util.function.BinaryOperator;

public class AverageCalculator {
    public double calculateAverage(double num1, double num2, BinaryOperator<Double> operation) {
        return operation.apply(num1, num2);
    }
}

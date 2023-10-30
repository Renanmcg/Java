package BinaryOperator;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        // Função que aceita dois números e um BinaryOperator para realizar uma operação matemática
        double num1 = 5.0;
        double num2 = 3.0;

        BinaryOperator<Double> addition = (x, y) -> x + y;
        BinaryOperator<Double> subtraction = (x, y) -> x - y;
        BinaryOperator<Double> multiplication = (x, y) -> x * y;

        Calculator calculator = new Calculator();

        System.out.println("Adição: " + calculator.performOperation(num1, num2, addition));
        System.out.println("Subtração: " + calculator.performOperation(num1, num2, subtraction));
        System.out.println("Multiplicação: " + calculator.performOperation(num1, num2, multiplication));

        // Programa que usa BinaryOperators para calcular a média de dois números
        BinaryOperator<Double> averageOperation = (x, y) -> (x + y) / 2;

        AverageCalculator averageCalculator = new AverageCalculator();
        double average = averageCalculator.calculateAverage(num1, num2, averageOperation);
        System.out.println("Média: " + average);

        // Função que compara duas strings e retorna a mais longa usando um BinaryOperator
        String string1 = "Hello";
        String string2 = "World";

        BinaryOperator<String> longerString = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;

        StringComparator stringComparator = new StringComparator();
        String longestString = stringComparator.findLongestString(string1, string2, longerString);
        System.out.println("A string mais longa é: " + longestString);
    }
}

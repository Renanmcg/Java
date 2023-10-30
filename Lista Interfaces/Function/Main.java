package Function;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> words = List.of("maçã", "banana", "cereja", "damasco");
        List<Double> doubleNumbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        List<Integer> squares = NumberUtils.squareNumbers(numbers);
        System.out.println("Quadrados dos números: " + squares);

        List<String> upperCaseWords = StringUtils.toUpperCase(words);
        System.out.println("Palavras em maiúsculas: " + upperCaseWords);

        double average = MathUtils.calculateAverage(doubleNumbers);
        System.out.println("Média dos números: " + average);
    }
}

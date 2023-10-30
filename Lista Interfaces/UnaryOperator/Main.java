package UnaryOperator;

import java.util.List;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("hello world", "java is fun", "unary operator");

        // Adicionando um valor fixo a cada elemento da lista de números
        UnaryOperator<Integer> addValue = num -> num + 10;
        List<Integer> modifiedNumbers = NumberManipulator.addValueToList(numbers, 10, addValue);
        System.out.println("Números modificados: " + modifiedNumbers);

        // Invertendo o sinal dos números na lista
        UnaryOperator<Integer> invertSign = num -> -num;
        List<Integer> invertedNumbers = NumberInverter.invertNumbers(numbers, invertSign);
        System.out.println("Números invertidos: " + invertedNumbers);

        // Capitalizando a primeira letra de cada palavra na lista de strings
        UnaryOperator<String> capitalizeFirstLetter = str -> {
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
            return String.join(" ", words);
        };
        List<String> capitalizedStrings = StringCapitalizer.capitalizeFirstLetter(strings, capitalizeFirstLetter);
        System.out.println("Strings capitalizadas: " + capitalizedStrings);
    }
}

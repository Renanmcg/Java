package UnaryOperator;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


public class NumberInverter {
    public static List<Integer> invertNumbers(List<Integer> numbers, UnaryOperator<Integer> operator) {
        return numbers.stream()
                .map(operator)
                .collect(Collectors.toList());
    }
}

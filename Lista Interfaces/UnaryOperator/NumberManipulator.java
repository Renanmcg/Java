package UnaryOperator;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class NumberManipulator {
    public static List<Integer> addValueToList(List<Integer> numbers, int value, UnaryOperator<Integer> operator) {
        return numbers.stream()
                .map(number -> operator.apply(number + value))
                .collect(Collectors.toList());
    }
}

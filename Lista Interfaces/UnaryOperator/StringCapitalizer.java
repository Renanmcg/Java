package UnaryOperator;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StringCapitalizer {
    public static List<String> capitalizeFirstLetter(List<String> strings, UnaryOperator<String> operator) {
        return strings.stream()
                .map(operator)
                .collect(Collectors.toList());
    }
}


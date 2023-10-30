package Function;

import java.util.List;
import java.util.ArrayList;

class NumberUtils {
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> squares = new ArrayList<>();
        for (Integer number : numbers) {
            squares.add(number * number);
        }
        return squares;
    }
}
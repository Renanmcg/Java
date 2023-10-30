package BinaryOperator;

import java.util.function.BinaryOperator;

public class StringComparator {
    public String findLongestString(String str1, String str2, BinaryOperator<String> comparator) {
        return comparator.apply(str1, str2);
    }
}

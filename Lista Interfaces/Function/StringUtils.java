package Function;

import java.util.List;
import java.util.ArrayList;

class StringUtils {
    public static List<String> toUpperCase(List<String> strings) {
        List<String> upperCaseStrings = new ArrayList<>();
        for (String str : strings) {
            upperCaseStrings.add(str.toUpperCase());
        }
        return upperCaseStrings;
    }
}


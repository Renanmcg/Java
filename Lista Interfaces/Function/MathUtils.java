package Function;

import java.util.List;

class MathUtils {
    public static double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}
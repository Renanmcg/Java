package Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.Random;

class RandomNumberSupplier {
    public static Supplier<List<Integer>> getRandomNumbersSupplier(int count, int min, int max) {
        return () -> {
            Random random = new Random();
            return random.ints(count, min, max)
                    .boxed()
                    .collect(Collectors.toList());
        };
    }
}
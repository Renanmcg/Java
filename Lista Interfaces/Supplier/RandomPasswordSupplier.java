package Supplier;

import java.util.function.Supplier;
import java.security.SecureRandom;
import java.util.stream.Collectors;

class RandomPasswordSupplier {
    public static Supplier<String> getRandomPasswordSupplier(int length) {
        return () -> {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
            SecureRandom random = new SecureRandom();

            return random.ints(length, 0, characters.length())
                    .mapToObj(characters::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());
        };
    }
}
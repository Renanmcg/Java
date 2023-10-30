import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        // Verificando se um número é par ou ímpar
        Predicate<Integer> isEven = num -> num % 2 == 0;
        int numberToCheck = 7;
        System.out.println("O número " + numberToCheck + " é par? " + isEven.test(numberToCheck));

        // Filtrando palavras que começam com a letra 'A' em uma lista de strings
        List<String> words = Arrays.asList("Arara", "Banana", "Cereja", "Advogado", "Laranja");
        Predicate<String> startsWithA = word -> word.startsWith("A");
        List<String> filteredWords = filterList(words, startsWithA);
        System.out.println("Palavras que começam com 'A': " + filteredWords);

        // Verificando a elegibilidade para votar com base na idade (considerando as regras do Brasil)
        Predicate<Integer> isEligibleToVote = age -> {
            if (age >= 18) {
                System.out.println("Voto obrigatório.");
                return true;
            } else if (age >= 16) {
                System.out.println("Voto opcional.");
                return true;
            } else {
                System.out.println("Não é elegível para votar.");
                return false;
            }
        };
        
        int ageToCheck = 25;
        System.out.println("Uma pessoa com " + ageToCheck + " anos é elegível para votar no Brasil? " + isEligibleToVote.test(ageToCheck));
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        // Filtra os elementos da lista com base no predicado
        return list.stream().filter(predicate).toList();
    }
}

package Supplier;

import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Fornecendo uma lista de números aleatórios
        Supplier<List<Integer>> randomNumbersSupplier = RandomNumberSupplier.getRandomNumbersSupplier(5, 1, 100);
        List<Integer> randomNumbers = randomNumbersSupplier.get();
        System.out.println("Números aleatórios: " + randomNumbers);

        // Fornecendo uma instância de uma classe de modelo
        Supplier<ModelClass> modelSupplier = ModelInstanceSupplier.getModelInstanceSupplier("Exemplo");
        ModelClass modelInstance = modelSupplier.get();
        System.out.println("Nome da instância de modelo: " + modelInstance.getName());

        // Gerando senhas aleatórias
        Supplier<String> randomPasswordSupplier = RandomPasswordSupplier.getRandomPasswordSupplier(12);
        String randomPassword = randomPasswordSupplier.get();
        System.out.println("Senha aleatória: " + randomPassword);
    }
}
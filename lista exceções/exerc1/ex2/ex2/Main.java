package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            validarIdade(idade);
            System.out.println("Sua idade é válida.");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade <= 0 || idade >= 150) {
            throw new IdadeInvalidaException("Idade inválida. A idade deve ser maior que 0 e menor que 150.");
        }
    }
}
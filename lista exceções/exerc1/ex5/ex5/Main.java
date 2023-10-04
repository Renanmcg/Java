package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o CPF (apenas números): ");
            String cpf = scanner.nextLine();

            if (CpfValidator.validarCPF(cpf)) {
                System.out.println("CPF válido.");
            } else {
                System.out.println("CPF inválido.");
            }
        } catch (CpfInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

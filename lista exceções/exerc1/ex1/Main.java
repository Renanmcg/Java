package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Calculadora Simples");
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = CalculadoraUtils.calcular(num1, operador, num2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema inesperado.");
        } finally {
            scanner.close();
        }
    }
}
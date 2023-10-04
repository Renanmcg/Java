package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número de linhas da primeira matriz: ");
            int linhasA = scanner.nextInt();
            System.out.println("Digite o número de colunas da primeira matriz: ");
            int colunasA = scanner.nextInt();

            System.out.println("Digite o número de linhas da segunda matriz: ");
            int linhasB = scanner.nextInt();
            System.out.println("Digite o número de colunas da segunda matriz: ");
            int colunasB = scanner.nextInt();

            int[][] matrizA = lerMatriz("primeira", linhasA, colunasA, scanner);
            int[][] matrizB = lerMatriz("segunda", linhasB, colunasB, scanner);

            if (colunasA != linhasB) {
                throw new IllegalArgumentException("As dimensões das matrizes não são compatíveis para multiplicação.");
            }

            MatrizUtils matrizUtils = new MatrizUtils();
            int[][] soma = matrizUtils.somarMatrizes(matrizA, matrizB);
            int[][] produto = matrizUtils.multiplicarMatrizes(matrizA, matrizB);

            System.out.println("Resultado da soma:");
            matrizUtils.imprimirMatriz(soma);

            System.out.println("Resultado da multiplicação:");
            matrizUtils.imprimirMatriz(produto);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int[][] lerMatriz(String nome, int linhas, int colunas, Scanner scanner) {
        System.out.println("Digite os elementos da " + nome + " matriz:");
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }
}

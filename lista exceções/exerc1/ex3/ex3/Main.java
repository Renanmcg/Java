package ex3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo a ser lido: ");
        String nomeArquivo = scanner.nextLine();

        FileReaderApp fileReader = new FileReaderApp();
        try {
            fileReader.lerArquivo(nomeArquivo);
        } catch (FileReadException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
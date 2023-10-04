package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public void lerArquivo(String nomeArquivo) throws FileReadException {
        FileReader arquivo = null;
        BufferedReader leitor = null;

        try {
            arquivo = new FileReader(nomeArquivo);
            leitor = new BufferedReader(arquivo);

            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new FileReadException("Erro durante a leitura do arquivo.", e);
        } finally {
            fecharRecursos(arquivo, leitor);
        }
    }

    private void fecharRecursos(FileReader arquivo, BufferedReader leitor) {
        try {
            if (leitor != null) {
                leitor.close();
            }
            if (arquivo != null) {
                arquivo.close();
            }
        } catch (IOException e) {
            System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
        }
    }
}





package sobrecarga.ex5;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

// Classe derivada ConexaoBDSegura que herda de ConexaoBD
class ConexaoBDSegura extends ConexaoBD {
    // Sobrescreve o método executarConsulta para lidar com exceções de forma segura
    @Override
    public void executarConsulta() {
        try {
            super.executarConsulta();
        } catch (ConsultaException e) {
            // Registra a exceção em um arquivo de log
            registrarErroNoLog(e);
        }
    }

    // Método para registrar exceções em um arquivo de log
    private void registrarErroNoLog(Exception e) {
        try (FileWriter arquivoLog = new FileWriter("log.txt", true);
             PrintWriter gravarLog = new PrintWriter(arquivoLog)) {
            gravarLog.println("Erro: " + e.getMessage());
            System.out.println("Erro registrado no arquivo de log.");
        } catch (IOException ex) {
            System.err.println("Erro ao registrar no arquivo de log: " + ex.getMessage());
        }
    }
}
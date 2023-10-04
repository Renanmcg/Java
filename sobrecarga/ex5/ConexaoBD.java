package sobrecarga.ex5;

// Classe base ConexaoBD que simula uma conexão com um banco de dados
class ConexaoBD {
    public void conectar() {
        // Simulação de código de conexão com o banco de dados
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    // Método para executar uma consulta que pode lançar ConsultaException
    public void executarConsulta() throws ConsultaException {
        // Simulação de uma consulta que lança uma exceção
        System.out.println("Executando consulta no banco de dados.");
        throw new ConsultaException("Erro na consulta ao banco de dados.");
    }

    public void desconectar() {
        // Simulação de código de desconexão com o banco de dados
        System.out.println("Conexão com o banco de dados encerrada.");
    }
}
package sobrecarga.ex5;

public class Main {
    public static void main(String[] args) {
        // Teste de exceção em ConexaoBD
        ConexaoBD conexaoBD = new ConexaoBD();
        conexaoBD.conectar();
        try {
            conexaoBD.executarConsulta();
        } catch (ConsultaException e) {
            System.err.println("Erro ao executar consulta: " + e.getMessage());
        } finally {
            conexaoBD.desconectar();
        }

        System.out.println();

        // Teste de exceção em ConexaoBDSegura
        ConexaoBDSegura conexaoBDSegura = new ConexaoBDSegura();
        conexaoBDSegura.conectar();
        conexaoBDSegura.executarConsulta(); // Exceção será registrada no log
        conexaoBDSegura.desconectar();
    }
}

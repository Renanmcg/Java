package sobrecarga.ex5;

// Exceção personalizada ConsultaException
class ConsultaException extends Exception {
    public ConsultaException(String mensagem) {
        super(mensagem);
    }
}

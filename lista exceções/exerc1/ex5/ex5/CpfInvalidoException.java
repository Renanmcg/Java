package ex5;

public class CpfInvalidoException extends Exception {
    public CpfInvalidoException(String mensagem) {
        super(mensagem);
    }
}
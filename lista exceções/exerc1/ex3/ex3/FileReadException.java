package ex3;

public class FileReadException extends Exception {
    public FileReadException(String mensagem) {
        super(mensagem);
    }

    public FileReadException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

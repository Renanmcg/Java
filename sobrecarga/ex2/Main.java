package sobrecarga.ex2;

public class Main {
    public static void main(String[] args) {
        // Exemplos de criação de objetos Pessoa usando diferentes construtores

        // Construtor com nome
        Pessoa pessoa1 = new Pessoa("João");

        // Construtor com nome e idade
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        // Construtor com nome, idade e endereço
        Pessoa pessoa3 = new Pessoa("Carlos", 25, "Rua A, 123");

        // Exibindo informações das pessoas criadas
        System.out.println("Pessoa 1: Nome=" + pessoa1.getNome() + ", Idade=" + pessoa1.getIdade() + ", Endereço="
                + pessoa1.getEndereco());
        System.out.println("Pessoa 2: Nome=" + pessoa2.getNome() + ", Idade=" + pessoa2.getIdade() + ", Endereço="
                + pessoa2.getEndereco());
        System.out.println("Pessoa 3: Nome=" + pessoa3.getNome() + ", Idade=" + pessoa3.getIdade() + ", Endereço="
                + pessoa3.getEndereco());
    }
}

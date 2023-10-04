package exercicio2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("Romeu e Julieta", "William Shakespeare", 1597);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Lista de Livros na Biblioteca:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }

        biblioteca.removerLivro(livro1);

        System.out.println("\nLista de Livros na Biblioteca após a remoção:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }
    }
}






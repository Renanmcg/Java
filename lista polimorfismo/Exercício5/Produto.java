package Exercício5;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto() {
        return 0.0; // Implementação padrão para desconto
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
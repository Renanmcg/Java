package Exercício5;

class Alimento extends Produto {
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05; // Desconto para alimentos: 5% do preço
    }
}
package Exercício5;

class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.1; // Desconto para produtos eletrônicos: 10% do preço
    }
}

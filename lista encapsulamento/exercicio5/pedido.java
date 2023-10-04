package exercicio5;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Produto> produtos;
    private List<Integer> quantidades;

    public Pedido() {
        produtos = new ArrayList<>();
        quantidades = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            precoTotal += produto.getPreco() * quantidade;
        }
        return precoTotal;
    }

    public void imprimirDetalhesDoPedido() {
        System.out.println("Detalhes do Pedido:");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            System.out.println("Produto: " + produto.getNome() + " | Quantidade: " + quantidade);
        }
        System.out.println("Preço Total: R$" + calcularPrecoTotal());
    }
}
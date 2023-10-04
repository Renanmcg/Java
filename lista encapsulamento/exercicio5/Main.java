package exercicio5;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99);
        Produto produto2 = new Produto("Calça Jeans", 49.99);

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(produto1, 2);
        pedido.adicionarProduto(produto2, 1);

        pedido.imprimirDetalhesDoPedido();
    }
}
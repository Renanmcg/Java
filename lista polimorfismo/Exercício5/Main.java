package Exercício5;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 30.0);
        Eletronico eletronico1 = new Eletronico("Smartphone", 1000.0);
        Alimento alimento1 = new Alimento("Maçã", 2.0);

        double descontoProduto1 = produto1.calcularDesconto();
        double descontoEletronico1 = eletronico1.calcularDesconto();
        double descontoAlimento1 = alimento1.calcularDesconto();

        System.out.println("Desconto para " + produto1.getNome() + ": R$" + descontoProduto1);
        System.out.println("Desconto para " + eletronico1.getNome() + ": R$" + descontoEletronico1);
        System.out.println("Desconto para " + alimento1.getNome() + ": R$" + descontoAlimento1);
    }
}






package exercicio1;

public class Main {

    public static void main(String[] args) {
       
        ContaBancaria minhaConta = new ContaBancaria(12345, "João da Silva", 1000.0);

        minhaConta.exibirInformacoes(); 

        minhaConta.depositar(500.0); 
        minhaConta.sacar(200.0); 
        minhaConta.exibirInformacoes(); 
    }
}
package sobrecarga.ex4;

public class Main {
    public static void main(String[] args) {
        // Exemplos de uso das classes

        // Conta corrente com taxa de 10
        ContaCorrente contaCorrente = new ContaCorrente(1000, 10);
        contaCorrente.deposito(500);
        contaCorrente.retirada(200); // Aplicará a taxa de 10

        // Conta poupança com limite de saque de 300
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000, 300);
        contaPoupanca.deposito(1000);
        contaPoupanca.retirada(400); // Excederá o limite de saque
    }
}

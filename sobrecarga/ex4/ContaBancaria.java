package sobrecarga.ex4;

// Classe base ContaBancaria
class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depósito
    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    // Método para retirada (será sobrescrito nas subclasses)
    public void retirada(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada de " + valor + " realizada. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a retirada.");
        }
    }
}

package sobrecarga.ex4;

// Subclasse ContaPoupanca que herda de ContaBancaria
class ContaPoupanca extends ContaBancaria {
    private double limiteSaque;

    public ContaPoupanca(double saldoInicial, double limiteSaque) {
        super(saldoInicial);
        this.limiteSaque = limiteSaque;
    }

    // Sobrescreve o método de retirada para aplicar limite de saque
    @Override
    public void retirada(double valor) {
        if (valor <= limiteSaque) {
            super.retirada(valor);
        } else {
            System.out.println("Limite de saque excedido. O limite é de " + limiteSaque);
        }
    }
}
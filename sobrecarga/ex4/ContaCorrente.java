package sobrecarga.ex4;

// Subclasse ContaCorrente que herda de ContaBancaria
class ContaCorrente extends ContaBancaria {
    private double taxa;

    public ContaCorrente(double saldoInicial, double taxa) {
        super(saldoInicial);
        this.taxa = taxa;
    }

    // Sobrescreve o método de retirada para aplicar taxa
    @Override
    public void retirada(double valor) {
        double valorComTaxa = valor + taxa;
        super.retirada(valorComTaxa);
        System.out.println("Taxa de " + taxa + " aplicada.");
    }
}
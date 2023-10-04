package Exercício2;

// Classe Retângulo que herda de Forma
class Retangulo extends Forma {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura; // Área do retângulo
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimento + largura); // Perímetro do retângulo
    }
}
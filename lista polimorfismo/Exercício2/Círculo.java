package Exercício2;

// Classe Círculo que herda de Forma
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; // Área do círculo
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio; // Perímetro do círculo
    }
}
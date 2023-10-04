package Exercício2;

public class Main {
    public static void main(String[] args) {
        // Exemplos de uso das classes

        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());
    }
}

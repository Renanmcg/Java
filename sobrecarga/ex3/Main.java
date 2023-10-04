package sobrecarga.ex3;

public class Main {
    public static void main(String[] args) {
        // Criando objetos das classes Circulo e Retangulo
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);

        // Calculando e exibindo a área das formas geométricas
        System.out.println("Área do Círculo: " + circulo.calcularArea() + " unidades quadradas");
        System.out.println("Área do Retângulo: " + retangulo.calcularArea() + " unidades quadradas");
    }
}
package sobrecarga.ex1;

public class Calculadora {
    // Método para soma de dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para soma de dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtração de dois inteiros
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para subtração de dois números de ponto flutuante
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicação de dois inteiros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para multiplicação de dois números de ponto flutuante
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para divisão de dois inteiros
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    // Método para divisão de dois números de ponto flutuante
    public double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
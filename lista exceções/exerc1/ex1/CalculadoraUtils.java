package ex1;

class CalculadoraUtils {
    public static double calcular(double num1, char operador, double num2) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero não permitida.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
package sobrecarga.ex1;

    public class Main{

        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();

            // Teste dos métodos com diferentes tipos de argumentos
            int resultado1 = calculadora.somar(5, 3);
            double resultado2 = calculadora.somar(5.5, 3.3);

            int resultado3 = calculadora.subtrair(8, 2);
            double resultado4 = calculadora.subtrair(8.8, 2.2);

            int resultado5 = calculadora.multiplicar(4, 3);
            double resultado6 = calculadora.multiplicar(4.4, 3.3);

            int resultado7 = calculadora.dividir(10, 2);
            double resultado8 = calculadora.dividir(10.0, 2.0);

            System.out.println("Soma (int): " + resultado1);
            System.out.println("Soma (double): " + resultado2);

            System.out.println("Subtração (int): " + resultado3);
            System.out.println("Subtração (double): " + resultado4);

            System.out.println("Multiplicação (int): " + resultado5);
            System.out.println("Multiplicação (double): " + resultado6);

            System.out.println("Divisão (int): " + resultado7);
            System.out.println("Divisão (double): " + resultado8);
    }
}
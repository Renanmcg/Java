package Exercício1;

class Veiculo {
    // Atributos comuns a todos os veículos
    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    // Método para acelerar
    public void acelerar(double incremento) {
        velocidadeAtual += incremento;
        System.out.println("O veículo está acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
    }
}


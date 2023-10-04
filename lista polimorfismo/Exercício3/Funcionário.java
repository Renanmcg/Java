package Exercício3;

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.05; // Exemplo de cálculo de bônus: 5% do salário
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
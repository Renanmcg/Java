package Exercício3;

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.1; // Bônus para gerentes: 10% do salário
    }
}
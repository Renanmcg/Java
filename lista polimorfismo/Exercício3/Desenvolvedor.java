package Exercício3;

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.08; // Bônus para desenvolvedores: 8% do salário
    }
}
package Exercício3;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 5000.0);
        Gerente gerente1 = new Gerente("Maria", 8000.0);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Carlos", 6000.0);

        double bonusFuncionario1 = funcionario1.calcularBonus();
        double bonusGerente1 = gerente1.calcularBonus();
        double bonusDesenvolvedor1 = desenvolvedor1.calcularBonus();

        System.out.println("Bônus de " + funcionario1.getNome() + ": R$" + bonusFuncionario1);
        System.out.println("Bônus de " + gerente1.getNome() + ": R$" + bonusGerente1);
        System.out.println("Bônus de " + desenvolvedor1.getNome() + ": R$" + bonusDesenvolvedor1);
    }
}







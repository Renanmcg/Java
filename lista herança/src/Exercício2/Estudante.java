package Exercício2;

public class Estudante extends Pessoa{
	int matricula;
	public Estudante(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
}

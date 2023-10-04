package Exercício4;

import Exercício2.Pessoa;

	public class Gerente extends Funcionário{
		String setor;
		public Gerente(String nome, int salario, String setor) {
			super(nome, salario);
			this.setor = setor;
		}
}

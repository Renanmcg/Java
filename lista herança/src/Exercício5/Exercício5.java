package Exercício5;

public class Exercício5 {
    public static void main(String[] args) {
        Mamífero meuMamifero = new Mamífero("Leão", 5, "Macho");
        System.out.println("Nome: " + meuMamifero.nome);
        System.out.println("Idade: " + meuMamifero.idade);
        System.out.println("Gênero: " + meuMamifero.gênero); 
        meuMamifero.fazerSom();
    }
}

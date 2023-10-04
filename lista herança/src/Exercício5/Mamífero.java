package Exercício5;

public class Mamífero extends Animal {
    String gênero;
    public Mamífero(String nome, int idade, String gênero) {
        super(nome, idade);
        this.gênero = gênero;
    }
}

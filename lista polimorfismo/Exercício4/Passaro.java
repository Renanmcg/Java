package Exercício4;

class Passaro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O pássaro cantou: Piu piu!");
    }

    @Override
    public void mover() {
        System.out.println("O pássaro voou no céu.");
    }
}
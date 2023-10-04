package Exercício4;


class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato miou: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato pulou e se moveu silenciosamente.");
    }
}

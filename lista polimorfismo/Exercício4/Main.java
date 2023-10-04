package Exercício4;

public class Main {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();

        System.out.println("Animal Genérico:");
        animalGenerico.emitirSom();
        animalGenerico.mover();

        System.out.println("\nCachorro:");
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println("\nGato:");
        gato.emitirSom();
        gato.mover();

        System.out.println("\nPássaro:");
        passaro.emitirSom();
        passaro.mover();
    }
}






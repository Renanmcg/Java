package Exercício1;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Focus", 2021);
        Moto minhaMoto = new Moto("Honda", "CBR 600", 2022);
        Caminhao meuCaminhao = new Caminhao("Volvo", "FH16", 2020);

        meuCarro.acelerar(80);
        minhaMoto.acelerar(60);
        meuCaminhao.acelerar(40);
    }
}

package exercicio4;

public class Main {
    public static void main(String[] args) {
        try {
            Automovel carro = new Automovel("Toyota", "Corolla", 2022);
            System.out.println(carro);

            carro.setMarca("");
            carro.setModelo(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
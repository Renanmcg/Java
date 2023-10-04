package exercicio4;

public class Automovel {
    private String marca;
    private String modelo;
    private int ano;

    public Automovel(String marca, String modelo, int ano) {
        setMarca(marca); 
        setModelo(modelo);
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("A marca não pode ser vazia ou nula.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("O modelo não pode ser vazio ou nulo.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano;
    }
}
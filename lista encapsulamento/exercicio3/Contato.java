package exercicio3;

class Contato {
    private String nome;
    private String numeroTelefone;
    private String enderecoEmail;

    public Contato(String nome, String numeroTelefone, String enderecoEmail) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.enderecoEmail = enderecoEmail;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + numeroTelefone + " | Email: " + enderecoEmail;
    }
}

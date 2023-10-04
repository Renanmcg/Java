package exercicio3;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}

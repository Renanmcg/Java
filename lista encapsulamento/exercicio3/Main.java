package exercicio3;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("João", "123-456-7890", "joao@example.com");
        Contato contato2 = new Contato("Maria", "987-654-3210", "maria@example.com");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        System.out.println("Lista de Contatos na Agenda:");
        for (Contato contato : agenda.listarContatos()) {
            System.out.println(contato);
        }

        agenda.removerContato(contato1);

        System.out.println("\nLista de Contatos na Agenda após a remoção:");
        for (Contato contato : agenda.listarContatos()) {
            System.out.println(contato);
        }
    }
}




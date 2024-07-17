package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }


    public void adicionarContato(String nome, int numero){
        contatoSet.add(new  Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Gustavo", 555);
        agendaContatos.adicionarContato("Gustavo", 123);
        agendaContatos.adicionarContato("Gustavo Caçador", 1233333);
        agendaContatos.adicionarContato("Gustavo Ronchi", 1217621);
        agendaContatos.adicionarContato("José Santos", 1233333);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("José"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("José Santos", 7777777));
        
        agendaContatos.exibirContato();
    }
}



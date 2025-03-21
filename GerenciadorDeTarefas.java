import java.util.ArrayList;
import java.util.Scanner;

// Classe base para Tarefa
class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return descricao + " | Concluída: " + (concluida ? "Sim" : "Não");
    }
}

// Classe que gerencia as tarefas
class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionar(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void remover(int indice) throws IndexOutOfBoundsException {
        tarefas.remove(indice);
    }

    public void concluir(int indice) throws IndexOutOfBoundsException {
        tarefas.get(indice).concluir();
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println("[" + i + "] " + tarefas.get(i));
            }
        }
    }
}


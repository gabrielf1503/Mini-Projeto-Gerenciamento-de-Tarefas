import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite a descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        lista.adicionar(descricao);
                        break;
                    case 2:
                        System.out.print("Digite o índice da tarefa a ser removida: ");
                        int indiceRemover = scanner.nextInt();
                        lista.remover(indiceRemover);
                        break;
                    case 3:
                        System.out.print("Digite o índice da tarefa a ser concluída: ");
                        int indiceConcluir = scanner.nextInt();
                        lista.concluir(indiceConcluir);
                        break;
                    case 4:
                        lista.listar();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice inválido. Por favor, tente novamente.");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemaGerenciamentoFuncionarios sistema = new SistemaGerenciamentoFuncionarios();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    buscarFuncionario();
                    break;
                case 5:
                    relatarProgressoTodosFuncionarios();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nSelecione uma opção:");
        System.out.println("1. Adicionar funcionário");
        System.out.println("2. Remover funcionário");
        System.out.println("3. Listar todos os funcionários");
        System.out.println("4. Buscar funcionário");
        System.out.println("5. Relatar progresso de todos os funcionários");
        System.out.println("6. Sair");
    }

    private static int lerOpcao() {
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    private static void adicionarFuncionario() {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite a matrícula do funcionário:");
        String matricula = scanner.nextLine();
        // Aqui você pode adicionar a lógica para selecionar o tipo de funcionário e criar o objeto correspondente
        // Depois, adicione o funcionário ao sistema utilizando sistema.adicionarFuncionario(funcionario);
    }

    private static void removerFuncionario() {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite a matrícula do funcionário a ser removido:");
        String matriculaRemover = scanner.nextLine();
        // Aqui você pode adicionar a lógica para encontrar o funcionário com a matrícula especificada e removê-lo do sistema
        // Use sistema.removerFuncionario(funcionario) para remover o funcionário
    }

    private static void listarFuncionarios() {
        System.out.println("Todos os funcionários:");
        sistema.listarFuncionarios();
    }

    private static void buscarFuncionario() {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome ou matrícula do funcionário a ser buscado:");
        String termoBusca = scanner.nextLine();
        sistema.buscarFuncionario(termoBusca);
    }

    private static void relatarProgressoTodosFuncionarios() {
        sistema.relatarProgressoTodosFuncionarios();
    }
}

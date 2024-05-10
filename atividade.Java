import java.util.ArrayList;
import java.util.Scanner;

abstract class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}


class Gerente extends Funcionario implements Trabalhavel {
    private double bonusAnual;
    private String equipe;

    public Gerente(String nome, String matricula, double bonusAnual, String equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    @Override
    public double calcularSalario() {
      
        return 0.0; 
    }

    
    @Override
    public void trabalhar() {
        System.out.println("Gerente " + getNome() + " está gerenciando a equipe " + equipe + ".");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso do gerente " + getNome() + ":");
        
    }
}

class Desenvolvedor extends Funcionario implements Trabalhavel {
    private String[] tecnologias;

    public Desenvolvedor(String nome, String matricula, String[] tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
       
        return 0.0;
    }

    
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + getNome() + " está desenvolvendo.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso do desenvolvedor " + getNome() + ":");
        
    }
}

class Estagiario extends Funcionario implements Trabalhavel {
    private int horasDeTrabalho;
    private String supervisor;

    public Estagiario(String nome, String matricula, int horasDeTrabalho, String supervisor) {
        super(nome, matricula);
        this.horasDeTrabalho = horasDeTrabalho;
        this.supervisor = supervisor;
    }

    @Override
    public double calcularSalario() {
        return 0.0; 
    }

   
    @Override
    public void trabalhar() {
        System.out.println("Estagiário " + getNome() + " está trabalhando sob supervisão de " + supervisor + ".");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso do estagiário " + getNome() + ":");
        
    }
}


interface Trabalhavel {
    void trabalhar();
    void relatarProgresso();
}


class SistemaGerenciamentoFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome + " - " + funcionario.matricula);
        }
    }

    
    public void buscarFuncionario(String termo) {
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equalsIgnoreCase(termo) || funcionario.matricula.equalsIgnoreCase(termo)) {
                System.out.println("Funcionário encontrado:");
                System.out.println(funcionario.nome + " - " + funcionario.matricula);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum funcionário encontrado com o termo '" + termo + "'.");
        }
    }

    
    public void relatarProgressoTodosFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.relatarProgresso();
        }
    }
}


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
       
    }

    private static void removerFuncionario() {
        scanner.nextLine(); 
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

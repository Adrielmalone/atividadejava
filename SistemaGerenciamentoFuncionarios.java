import java.util.ArrayList;

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

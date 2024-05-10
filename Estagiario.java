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
        // Implemente o cálculo do salário para o estagiário aqui
        return 0.0; // apenas um exemplo, substitua com a lógica real
    }

    // Implementação dos métodos da interface Trabalhavel
    @Override
    public void trabalhar() {
        System.out.println("Estagiário " + getNome() + " está trabalhando sob supervisão de " + supervisor + ".");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso do estagiário " + getNome() + ":");
        // Implemente o relatório de progresso específico para o estagiário aqui
    }
}

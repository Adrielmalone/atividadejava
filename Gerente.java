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
        // Implemente o cálculo do salário para o gerente aqui
        return 0.0; // apenas um exemplo, substitua com a lógica real
    }

    // Implementação dos métodos da interface Trabalhavel
    @Override
    public void trabalhar() {
        System.out.println("Gerente " + getNome() + " está gerenciando a equipe " + equipe + ".");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso do gerente " + getNome() + ":");
        // Implemente o relatório de progresso específico para o gerente aqui
    }
}

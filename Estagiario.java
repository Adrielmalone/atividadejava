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

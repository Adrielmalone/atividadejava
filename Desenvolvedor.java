class Desenvolvedor extends Funcionario implements Trabalhavel {
    private String[] tecnologias;

    public Desenvolvedor(String nome, String matricula, String[] tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
        // Implemente o cálculo do salário para o desenvolvedor aqui
        return 0.0; // apenas um exemplo, substitua com a lógica real
    }

    // Implementação dos métodos da interface Trabalhavel
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + getNome() + " está desenvolvendo.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso do desenvolvedor " + getNome() + ":");
        // Implemente o relatório de progresso específico para o desenvolvedor aqui
    }
}

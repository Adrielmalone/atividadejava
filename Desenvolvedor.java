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

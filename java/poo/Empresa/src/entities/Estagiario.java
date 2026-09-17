package src.entities;

public class Estagiario extends Funcionario{
    private double estipendio;

    public Estagiario(String nome, double estipendio) {
        super(nome);
        this.estipendio = estipendio;
    }

    public double getEstipendio() {
        return estipendio;
    }

    public void setEstipendio(double estipendio) {
        this.estipendio = estipendio;
    }

    @Override 
    public void trabalhar(){ 
        System.out.printf("%s, mes que vem o meu salario cai na conta", getNome());
    }

    @Override 
    public double calcularSalario() {
        return estipendio;
    }
}

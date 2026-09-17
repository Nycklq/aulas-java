package src.entities;

public class Terceirizado extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public Terceirizado(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override 
    public void trabalhar() {
        System.out.println("%s está trabalhando");
    }

    @Override
    public double calcularSalario() {
        double salario = valorHora * horasTrabalhadas;
        return salario;
    }
}

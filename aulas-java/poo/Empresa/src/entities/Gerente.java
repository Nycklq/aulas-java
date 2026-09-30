package src.entities;

public class Gerente extends Funcionario{
    private double salarioBase;
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override 
    public void trabalhar() {
        System.out.printf("%s está trabalhando", getNome());
    }

    @Override 
    public double calcularSalario() {
        double salario = salarioBase + bonus;
        return salario;
    }
}

package src.entities;

public class Desenvolvedor extends Funcionario{
    private double salarioBase;
    private int horasExtras;
    private double taxaHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras, double taxaHoraExtra) {
        super(nome);
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.taxaHoraExtra = taxaHoraExtra;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setSalarioBase(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getTaxaHoraExtra() {
        return taxaHoraExtra;
    }

    public void setTaxaHoraExtra(double taxaHoraExtra) {
        this.taxaHoraExtra = taxaHoraExtra;
    }

    @Override 
    public void trabalhar() {
        System.out.printf("%s está trabalhando", getNome());
    }

    @Override 
    public double calcularSalario() {
        double salario = salarioBase + (horasExtras * taxaHoraExtra);

        return salario;
    }

}

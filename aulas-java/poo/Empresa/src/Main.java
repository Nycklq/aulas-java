package src;

import src.entities.Desenvolvedor;
import src.entities.Estagiario;
import src.entities.Funcionario;
import src.entities.Gerente;
import src.entities.Terceirizado;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = new Desenvolvedor("Nicollas", 20000, 20, 200);
        funcionarios[1] = new Gerente("Cristiano Ronaldo", 777777, 2000);
        funcionarios[2] = new Estagiario("Sidne", 2000);
        funcionarios[3] = new Terceirizado("Neymar", 200000000, 24);
        
        for(Funcionario emp : funcionarios) {
            emp.trabalhar();
        }

    }
}

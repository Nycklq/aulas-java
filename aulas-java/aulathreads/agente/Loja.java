package aulathreads.agente;

public class Loja {
    private int estoque = 5;

    public synchronized void comprar(String consumidor) {
        if (estoque > 0) {
            System.out.println(consumidor + " encontrou o produto");
            estoque--;
            System.out.println(consumidor + " comprou. Estoque: " + estoque);
        }
    }
}
    
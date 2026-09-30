package exercicio;

import exceptions.EstoqueInsuficienteException;
import exceptions.PagamentoRecusadoException;

public class Main {
   public static void main(String[] args) throws EstoqueInsuficienteException {

    CheckoutService checkout = new CheckoutService();

    try {
        checkout.finalizarCompra(3, 2500);
    } catch(EstoqueInsuficienteException e) {
        System.out.println("Nao foi possivel concluir a compra: " + e.getMessage());
    } catch(PagamentoRecusadoException e) {
        System.out.println("Problema no pagamento: " + e.getMessage());
    } catch(IllegalArgumentException e) {
        System.out.println("Dados invalidos: " + e.getMessage());
    } finally {
        System.out.println("Processamento do checkout encerrado");
    }
    
   }
}

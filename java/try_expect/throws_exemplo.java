import exceptions.ErroDivisao;

public class throws_exemplo {
    public static double divide(double dividendo,double divisor) throws ErroDivisao {
        
        if(divisor == 0) {
            throw new ErroDivisao("Nao pode ser dividido por zero");
        }

        return dividendo / divisor;
    }

    public static void main(String[] args) {
        double resultado;
 
        try {
            resultado = divide(10,0);
            System.out.println("Resultado da divisao: " + resultado);
        } catch(ErroDivisao e) {
            System.out.println("Excecao capturada: " + e.getMessage());
        }
    }

}

// Codigo de teste de conjunto de try and catch (Nao é recomendado fazer isso)

public class conjuntoDeTryAndCatch {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Try bloco 1");
                int num = 15 / 10;
                System.out.println(num);
            } catch(ArithmeticException ae) {
                System.out.println("Bloco de excecao 01: " + ae);
            }
            try {
                System.out.println("Try bloco 02");
                int num = 100/0;
                System.out.println(num);
            } catch(ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Bloco de excexao 02: " + aiobe);
        }
            System.out.println("Declaracao geral apos os blocos 01 e 02");
        } catch(ArithmeticException ae2) {
            System.out.println("Bloco principal do Arithimetic Exception: " + ae2);
        } catch(ArrayIndexOutOfBoundsException aiobe2) {
            System.out.println("Bloco principal Array index out of bounds exception: " + aiobe2);
        } catch(Exception e) {
            System.out.println("Bloco principal Excecao geral: " + e);
        }
    }
}

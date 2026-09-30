package aulathreads.enviarEmail;

public class Main {
    public static void main(String[] args) {
        String[] usuarios = {"Nyk@example.com", "raphael@example.com", "Sidne@example.com"};

        for(String email : usuarios) {
            EnviadorEmail thread = new EnviadorEmail(email);
            thread.start();
        }
        System.out.println("Todos os envios foram enviados");
    }
}

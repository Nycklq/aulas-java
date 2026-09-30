package aulathreads.enviarEmail;

public class EnviadorEmail extends Thread{
    private String destinatario;

    public EnviadorEmail(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override 
    public void run() {
        System.out.println("Enviando e-mail para: " + destinatario);

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            System.out.println("Erro ao enviar para: " + destinatario);
        }

        System.out.println("E-mail enviado para: " + destinatario);
    }
}

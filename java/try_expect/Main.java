import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ExeploThrows obj = new ExeploThrows();
            obj.umMetodo(1);
        } catch(IOException | ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
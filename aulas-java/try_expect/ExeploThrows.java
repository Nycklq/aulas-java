import java.io.IOException;

public class ExeploThrows {
    public void umMetodo(int num) throws IOException, ArithmeticException {
        if(num == 1) {
            throw new IOException("IOexception");
        } else {
            throw new ArithmeticException("ArithmeticException");
        }
    }
}


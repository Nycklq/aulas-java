public class evitarClassCast {
    public static void main(String[] args) {
        Object objeto = "Nicollas";

        if(objeto instanceof String string) {
            System.out.println("O objeto é uma string: " + string);
        } else {
            System.out.println("O objeto nao é uma string");
        }
    }
}

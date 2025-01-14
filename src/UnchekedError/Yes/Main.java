package UnchekedError.Yes;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Excepción no controlada: " + e.getMessage());
        }
}
}

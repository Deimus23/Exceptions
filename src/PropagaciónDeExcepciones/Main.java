package PropagaciónDeExcepciones;

public class Main {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println("Capture exception " + e.getMessage());
        }
    }

    static void metodo1() {
        metodo2();
    }

    static void metodo2() {
        metodo3();
    }

    static void metodo3() {
        int resultado = 10 / 0;  // Esto lanza ArithmeticException
    }
}


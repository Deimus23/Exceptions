package PropagaciónDeExcepciones.Checked;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (IOException e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }

    static void metodo1() throws IOException {
        metodo2();
    }

    static void metodo2() throws IOException {
        metodo3();
    }

    static void metodo3() throws IOException {
        throw new IOException("Error de entrada/salida en metodo3");
    }
}
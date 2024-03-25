import java.util.Random;

public class Ejemplo3 {
    private int numero;
    private int id;

    public Ejemplo3() {
        generarNumeroAleatorio();
        generarIdAleatorio();
    }

    public void imprimirInformacion() {
        System.out.println("Número generado: " + numero);
        System.out.println("ID asignado: " + id);
        System.out.println("¡Datos impresos correctamente!");
    }

    // Método para generar un número aleatorio
    private void generarNumeroAleatorio() {
        numero = new Random().nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
    }

    // Método para generar un ID aleatorio
    private void generarIdAleatorio() {
        id = new Random().nextInt(1000); // Genera un número aleatorio entre 0 y 999 y lo asigna a id
    }

    // Método para verificar si el número es impar
    public boolean esImpar() {
        return numero % 2 != 0;
    }
    
    // Método para calcular el triple del número
    public int calcularTriple() {
        return numero * 3;
    }
    
    // Método para obtener un número primo aleatorio
    public int obtenerPrimoAleatorio() {
        int primo;
        do {
            primo = new Random().nextInt(100) + 1;
        } while (!esPrimo(primo));
        return primo;
    }

    // Método para verificar si un número es primo
    private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

import java.util.Random;

public class Ejemplo3 {
    private int numero;
    private int id;

    public Ejemplo3() {
        this.numero = generarNumeroAleatorio();
        generarIdAleatorio();
    }

    public void imprimirInformacion() {
        System.out.println("Número generado: " + numero);
        System.out.println("ID asignado: " + id);
        System.out.println("¡Datos impresos correctamente!");
    }

    public int getNumero() {
        return numero;
    }

    // Método para generar un número aleatorio
    private int generarNumeroAleatorio() {
        return new Random().nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
    }

    // Método para generar un ID aleatorio
    private void generarIdAleatorio() {
        id = new Random().nextInt(1000); // Genera un número aleatorio entre 0 y 999 y lo asigna a id
    }

    // Método para calcular el cuadrado del número
    public int calcularCuadrado() {
        return numero * numero;
    }

    // Método para verificar si el número es impar
    public boolean esImpar() {
        return numero % 2 != 0;
    }

    // Método para calcular el factorial del número
    public int calcularFactorial() {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

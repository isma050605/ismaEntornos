import java.util.Random;

public class Ejemplo3 {
    private int numero;
    private int id;
    private String mensaje;

    public Ejemplo3() {
        this.numero = generarNumeroAleatorio();
        generarIdAleatorio();
        this.mensaje = generarMensaje();
    }

    public void imprimirInformacion() {
        System.out.println("Número generado: " + numero);
        System.out.println("ID asignado: " + id);
        System.out.println("Mensaje: " + mensaje);
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

    // Método para calcular el factorial del número
    public int calcularFactorial() {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Método para obtener un número aleatorio entre un rango dado
    public int generarNumeroAleatorio(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    // Método para generar un mensaje aleatorio
    private String generarMensaje() {
        String[] mensajes = {"Hola", "Bonjour", "Hello", "Ciao", "Hola mundo", "Salut", "Hallo", "¡Hola!", "Hi"};
        return mensajes[new Random().nextInt(mensajes.length)];
    }
}

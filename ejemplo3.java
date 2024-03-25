import java.util.Random;

public class ejemplo3 {
    private int numero;
    private int id;

    public ejemplo3(int numero) {
        this.numero = numero;
        generarIdAleatorio();
    }

    public void imprimirNumero() {
        System.out.println("Número generado: " + numero);
        System.out.println("ID asignado: " + id);
        System.out.println("Datos impresos correctamente.");
    }

    public int getNumero() {
        return numero;
    }

    // Nuevo método para generar un ID aleatorio
    private void generarIdAleatorio() {
        Random rand = new Random();
        id = rand.nextInt(1000); // Genera un número aleatorio entre 0 y 999 y lo asigna a id
    }

    // Método para obtener el factorial del número
    public int factorial() {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

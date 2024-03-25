package entornosTareaGit;
import java.util.Random;

public class ejemplo3 {
    private int numero;
    private int id;

    public ejemplo3(int numero) {
        this.numero = numero;
        generarIdAleatorio();
    }

    public void imprimirNumero() {
        System.out.println("Número desde ClaseDos: " + numero);
        System.out.println("Otro cambio");
        System.out.println("Este el primer cambio en el ejemplo 3 desde la rama master");
        System.out.println("Este es el segundo cambio en el ejemplo 3 desde la rama master");
    }

    public int getNumero() {
        return numero;
    }

    public void JuanCarlos() {
        System.out.println("JuanCarlos");
    }

    public int calcularSuma(int numero2) {
        return numero + numero2;
    }

    // Nuevo método para generar un ID aleatorio
    private void generarIdAleatorio() {
        Random rand = new Random();
        id = rand.nextInt(1000); // Genera un número aleatorio entre 0 y 999 y lo asigna a id
    }
}

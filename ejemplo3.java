package entornosTareaGit;
import java.util.Random;

public class ejemplo3 {
    private int numero;
    private int numero2;
    private int id;

    public ejemplo3(int numero) {
        this.numero = numero;
        Random rand = new Random();
        this.id = rand.nextInt(1000); // Genera un número aleatorio entre 0 y 999 y lo asigna a id
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

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void JuanCarlos() {
        System.out.println("JuanCarlos");
    }

    public int calcularSuma() {
        return numero + numero2;
    }

    // Nuevo método para calcular el producto de los dos números
    public int calcularProducto() {
        return numero * numero2;
    }
}

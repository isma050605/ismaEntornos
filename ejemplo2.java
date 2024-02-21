package entornosTareaGit;

public class ejemplo2 {
    private int numero;
    private int numero2;
    private int id;

    public ejemplo2(int numero) {
        this.numero = numero;
    }

    public void imprimirNumero() {
        System.out.println("Número desde ClaseDos: " + numero);
        System.out.println("Otro cambio");
        System.out.println("Este es el primer cambio del ejemplo2 desde la rama master");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
public void Isma() {
	System.out.println("Isma");
}
    public int getNumero2() {
        return numero2;
    }

    public void setId(int id) {
        this.id = id;
    }
}

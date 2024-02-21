package entornosTareaGit;

public class ejemplo3 {
    private int numero;
    private int numero2;
    private int id;
    public ejemplo3(int numero) {
        this.numero = numero;
    }
    public void imprimirNumero() {
        System.out.println("Número desde ClaseDos: " + numero);
        System.out.println("Otro cambio");
        System.out.println("Este el primer cambio en el ejemplo 3 desde la rama master");
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

    public int getId() {
        return id;
    }

    public void JuanCarlos() {
    	System.out.println("JuanCarlos");
    }
    
    public int calcularSuma() {
        return numero + numero2;
    }
}




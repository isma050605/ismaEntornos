package entornosTareaGit;

import java.util.Objects;

public class ejemplo2 {
    private int numero;
    private int id;
    private String direccion;

    public ejemplo2(int numero) {
        this.numero = numero;
    }

    public void imprimirNumeroarreglado() {
        System.out.println("Número desde ClaseDos: " + numero);
        System.out.println("Otro cambio");
        System.out.println("Este es el primer cambio del ejemplo2 desde la rama master");
        System.out.println("Este es el segundo cambio del ejemplo 2 desde la rama master");
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public int calcularCuadrado(int num) {
        return num * num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ejemplo2(int numero, int id, String direccion) {
        this.numero = numero;
        this.id = id;
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ejemplo2 other = (ejemplo2) obj;
        return Objects.equals(direccion, other.direccion);
    }

    public String getDireccion() {
        return direccion;
    }

    public void imprimirNumero() {
        System.out.println("Número desde ClaseDos: " + numero);
        System.out.println("Otro cambio");
        System.out.println("Este es el segundo cambio en el ejemplo 2 desde la rama jcisma");
        System.out.println("Este es el tercer cambio del ejemplo2 desde la rama jcisma");
    }
}

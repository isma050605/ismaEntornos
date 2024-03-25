package entornosTareaGit;

import java.util.Objects;

public class ejemplo2 {
    private int numero;
    private String direccion;

    public ejemplo2(int numero) {
        this.numero = numero;
    }

    public void imprimirNumero() {
        System.out.println("Número: " + numero);
        System.out.println("Otro cambio");
        System.out.println("Este es el segundo cambio en el ejemplo 2");
        System.out.println("Este es el tercer cambio del ejemplo 2");
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public int calcularCuadrado(int num) {
        return num * num;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ejemplo2 other = (ejemplo2) obj;
        return Objects.equals(direccion, other.direccion);
    }
}

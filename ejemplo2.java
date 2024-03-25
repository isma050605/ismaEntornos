package entornosTareaGit;

import java.util.Objects;

public class ejemplo2 {
    private int numero;
    private String direccion;

    public ejemplo2(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
    }

    public void imprimirDatos() {
        System.out.println("Número: " + numero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Datos impresos correctamente.");
    }

    public boolean esPositivo() {
        return numero > 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public void cambiarDireccion(String nuevaDireccion) {
        direccion = nuevaDireccion;
        System.out.println("La dirección ha sido modificada correctamente.");
    }

    public boolean mismaDireccion(ejemplo2 otroEjemplo) {
        return Objects.equals(direccion, otroEjemplo.direccion);
    }

    public boolean contienePalabra(String palabra) {
        return direccion.contains(palabra);
    }
}

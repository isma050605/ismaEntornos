package entornosTareaGit;

import java.util.Objects;

public class ejemplo2 {
    private int numero;
    private String direccion;

    public ejemplo2(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
    }

    public void imprimirNumeroYDireccion() {
        System.out.println("Número: " + numero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Datos impresos correctamente.");
    }

    public boolean esPositivo() {
        return numero > 0;
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

    // Método para verificar si el número es par
    public boolean esPar() {
        return numero % 2 == 0;
    }

    // Método para obtener la longitud de la dirección
    public int longitudDireccion() {
        return direccion.length();
    }

    // Método para imprimir el número
    public void imprimirNumero() {
        System.out.println("Número: " + numero);
    }

    // Método para verificar si la dirección es válida
    public boolean esDireccionValida() {
        // Aquí podrías implementar una lógica para validar la dirección
        return !direccion.isEmpty();
    }
}

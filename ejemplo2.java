package entornosTareaGit;

import java.util.Objects;

public class ejemplo2 {
    private int numero;
    private String direccion;

    public ejemplo2(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
    }

        return direccion;
    public void imprimirDatos() {
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


    public int longitudDireccion() {
        return direccion.length();
    }

    public void imprimirNumeroCaracteres() {
        System.out.println("La longitud de la dirección es: " + longitudDireccion());
    }

    public boolean esDireccionValida() {
        // Implementa la lógica para verificar si la dirección es válida
        // Por ejemplo, podría comprobar si la dirección contiene ciertos caracteres especiales
        // o si tiene un formato específico
        return true; // Por ahora, devolvemos siempre true como ejemplo
    }

    public void imprimirNumero() {
        System.out.println("Número: " + numero);
    }

    public void duplicarNumero() {
        numero *= 2;
        System.out.println("El número ha sido duplicado.");

    public boolean esNumeroMayor(int otroNumero) {
        return numero > otroNumero;
    }

    public boolean esCadenaVacia() {
        return direccion.isEmpty();
    }

    public void imprimirDireccion() {
        System.out.println("Dirección: " + direccion);
    }
}

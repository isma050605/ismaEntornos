package entornosTareaGit;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.function.*;
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
        System.out.println("Este es el segundo cambio del ejemplo 2 desde la rama master");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean esPar(int num) {
        return num % 2 == 0;
    }
public void Isma() {
	System.out.println("Isma");
}
    public int getNumero2() {
        return numero2;
    }
    public int calcularCuadrado(int num) {
        return num * num;
    }

    public void setId(int id) {
        this.id = id;
    }
}
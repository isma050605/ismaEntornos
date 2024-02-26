package entornosTareaGit;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.function.*;
import java.util.ArrayList;
import java.util.Objects;
public class ejemplo2 {
    private int numeroarreglado;
    private int numero2arreglado;
    private int id;
    private int numero;
    private int numero2;
    private int numero3;
    private String direccion;
    private int idOficina;
    private String ddd;
    private String Isma;

    public ejemplo2(int numero) {
        this.numero = numero;
    }

    public void imprimirNumeroarreglado() {
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
    public int getNumero2arreglado() {
        return numero2;
    }
    public int calcularCuadrado(int num) {
        return num * num;
    }

    public void setId(int id) {
        this.id = id;
    }



public ejemplo2(int numero, int numero2, int numero3, int id, String direccion) {
			super();
			this.numero = numero;
			this.numero2 = numero2;
			this.numero3 = numero3;
			this.id = id;
			this.direccion = direccion;
			this.Isma= Isma;
		}

public ejemplo2() {
	super();
	// TODO Auto-generated constructor stub
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

private void suma() {
	System.out.println("2+2=4");
}
	    public void imprimirNumero() {
	        System.out.println("Número desde ClaseDos: " + numero);
	        System.out.println("Otro cambio");
	        System.out.println("Este es el segundo cambio en el ejemplo 2 desde la rama jcisma");
	        System.out.println("Este es el tercer cambio del ejemplo2 desde la rama jcisma");
	    }
	}


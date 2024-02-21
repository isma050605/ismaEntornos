package entornosTareaGit;
import java.util.Scanner;
import java.util.ArrayList;

public class ejemplo1{
    private String mensaje;
    private String ip;
    private String nombre;
    private String apellido;
    private String entornos;


    public ejemplo1(String mensaje, String ip, String nombre, String apellido,String entornos) {
		super();
		this.mensaje = mensaje;
		this.ip = ip;
		this.nombre = nombre;
		this.apellido = apellido;
		this.entornos = entornos;
	}
    

	@Override
	public String toString() {
		return "ejemplo1 [mensaje=" + mensaje + ", ip=" + ip + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", entornos=" + entornos + "]";
	}


	public void imprimirMensaje() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Este es el primer cambio del ejemplo jcisma desde la rama jcisma");
        System.out.println("Este es el segundo cambio del ejemplo 1 desde la rama jcisma");
    }
}


package entornosTareaGit;
import java.util.Scanner;
public class ejemplo1{
    private String mensaje;
    private String ip;
    private String nombre;
    private String apellido;


    public ejemplo1(String mensaje, String ip, String nombre, String apellido) {
		super();
		this.mensaje = mensaje;
		this.ip = ip;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void imprimirMensaje() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Este es el primer cambio del ejemplo jcisma desde la rama jcisma");
    }
}


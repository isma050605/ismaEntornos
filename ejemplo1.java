package entornosTareaGit;
import java.util.Scanner;
import java.util.Objects;
//hola
public class ejemplo1{
    private String mensaje;
    private String ip;
    private String nombre;
    private String apellido;
    private String entornos;
    private int euro;
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
	 public static void solicitarYMostrarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "! Bienvenido.");
        scanner.close();
    }
	@Override
	public int hashCode() {
		return Objects.hash(apellido, entornos, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ejemplo1 other = (ejemplo1) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(entornos, other.entornos)
				&& Objects.equals(nombre, other.nombre);
	}
	public void imprimirMensaje() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Este es el primer cambio del ejemplo jcisma desde la rama jcisma");
        System.out.println("Este es el segundo cambio del ejemplo 1 desde la rama jcisma");
        System.out.println("Este es el tercer cambio del ejemplo 1 desde la rama jcisma");
    }
    
    public void imprimirMensaje2() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Otro cambio");
    }
    
}


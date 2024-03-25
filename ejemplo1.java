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
	public class Suma {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 10000000;
        int resultado = sumarNumeros(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int sumarNumeros(int num1, int num2) {
        return num1 + num2;
    }
}
//hola
    
    public void imprimirMensaje2() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Otro cambio mas");
    }
    
}


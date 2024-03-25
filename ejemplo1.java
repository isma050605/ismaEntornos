package entornosTareaGit;
import java.util.Scanner;
import java.util.Objects;

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
	
	public static int calcularFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        int numero = 5;
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    public void imprimirMensaje2() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Otro cambio mas");
    }
}



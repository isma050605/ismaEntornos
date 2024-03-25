
public class Ejemplo1 {

    private String mensaje;
    private String ip;
    private String nombre;
    private String apellido;
 public static void main(String[] args) {
        int numero = 5;
        int numPrimo = 17;
       int factorial = calcularFactorial(numero);
    );
    public Ejemplo1(String mensaje, String ip, String nombre, String apellido) {
        this.mensaje = mensaje;
        this.ip = ip;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }


        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
        System.out.println(numPrimo + " es primo: " + esPrimo(numPrimo));
        imprimirMensaje("Hola mundo");
        imprimirMensaje("Este es otro mensaje");
    }

    public static int calcularFactorial(int num) {
        if (num < 0) throw new IllegalArgumentException("El número no puede ser negativo.");
        return num == 0 ? 1 : num * calcularFactorial(num - 1);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }


    public static void imprimirMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Entornos: " + entornos);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        int numPrimo = 17;
        boolean resultadoPrimo = esPrimo(numPrimo);
        System.out.println(numPrimo + " es primo: " + resultadoPrimo);

        Ejemplo1 ejemplo = new Ejemplo1("Hola", "192.168.0.1", "Juan", "Pérez");
        ejemplo.imprimirInformacion();
    }

    public void imprimirInformacion() {
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Dirección IP: " + ip);
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Otro cambio más en el mensaje.");
    }
    public int longitudMensaje() {
        return mensaje.length();
    }
    public boolean esIpValida() {
        String[] partes = ip.split("\\.");
        if (partes.length != 4) {
            return false;
        }
        for (String parte : partes) {
            int valor = Integer.parseInt(parte);
            if (valor < 0 || valor > 255) {
                return false;
            }
        }
        return true;
    }

    // Método para imprimir el mensaje en mayúsculas
    public void imprimirMensajeEnMayusculas() {
        System.out.println("Mensaje en mayúsculas: " + mensaje.toUpperCase());
    }
}

public class ejemplo1 {
    private String mensaje;
    private String ip;
    private String nombre;
    private String apellido;
    private String entornos;
    private int euro;

    public ejemplo1(String mensaje, String ip, String nombre, String apellido, String entornos) {
        this.mensaje = mensaje;
        this.ip = ip;
        this.nombre = nombre;
        this.apellido = apellido;
        this.entornos = entornos;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 5;
        int numPrimo = 17;

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
    }
}

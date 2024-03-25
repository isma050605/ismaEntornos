package entornosTareaGit;

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

    public static int calcularFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        return num == 0 ? 1 : num * calcularFactorial(num - 1);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 5;
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        int numPrimo = 17;
        boolean resultadoPrimo = esPrimo(numPrimo);
        System.out.println(numPrimo + " es primo: " + resultadoPrimo);
    }

    public void imprimirMensaje2() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
        System.out.println("Otro cambio mas");
    }
}

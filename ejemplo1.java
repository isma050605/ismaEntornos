package entornosTareaGit;

public class ejemplo1{
    private String mensaje;
    private String ip;

    public ejemplo1(String mensaje) {
        this.mensaje = mensaje;
    }

    public void imprimirMensaje() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
    }
    
    public void imprimirMensaje2() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
        System.out.println("Otro cambio mas");
    }
    
}


package entornosTareaGit;

public class ejemplo1{
    private String mensaje;
    private String ip;

    public ejemplo1(String mensaje) {
        this.mensaje = mensaje;
    }

    public void imprimirMensaje() {
        System.out.println("Mensaje desde ClaseUno: " + mensaje);
    }
}


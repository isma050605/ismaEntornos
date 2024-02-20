package entornosTareaGit;
import java.util.ArrayList;
public class ejemplo2 {
	    private int numero;
	    private int numero2;
	    private int numero3;
        private int id;
        private String direccion;
	   
public ejemplo2(int numero, int numero2, int numero3, int id, String direccion) {
			super();
			this.numero = numero;
			this.numero2 = numero2;
			this.numero3 = numero3;
			this.id = id;
			this.direccion = direccion;
		}

public int getNumero() {
	return numero;
}
public String getDireccion() {
	return direccion;
}

private void suma() {
	System.out.println("2+2=4");
}
	    public void imprimirNumero() {
	        System.out.println("Número desde ClaseDos: " + numero);
	        System.out.println("Otro cambio");
	        
	    }
	}



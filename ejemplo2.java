package entornosTareaGit;
import java.util.ArrayList;
import java.util.Objects;
public class ejemplo2 {
	    private int numero;
	    private int numero2;
	    private int numero3;
        private int id;
        private String direccion;
        private int idOficina;
        private String ddd;
	   
public ejemplo2(int numero, int numero2, int numero3, int id, String direccion) {
			super();
			this.numero = numero;
			this.numero2 = numero2;
			this.numero3 = numero3;
			this.id = id;
			this.direccion = direccion;
		}


@Override
public int hashCode() {
	return Objects.hash(direccion);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ejemplo2 other = (ejemplo2) obj;
	return Objects.equals(direccion, other.direccion);
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
	        System.out.println("Este es el segundo cambio en el ejemplo 2 desde la rama jcisma");
	        
	    }
	}



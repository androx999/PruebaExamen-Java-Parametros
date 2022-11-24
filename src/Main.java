import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    Color col = new Color();
	    String color;
	    
	    System.out.println("Hola, seleccione un color disponible(Amarillo, Morado, Rosa, Azul y Blanco): ");
	    color = entrada.nextLine();
	   
	    
	    col.colorSeleccionado(color);
	    
	
	}
}

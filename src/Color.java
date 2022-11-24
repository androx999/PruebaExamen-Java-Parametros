
public class Color {

	public void colorSeleccionado(String color) {
		 switch(color) {
		    case "Amarillo":
		    	System.out.println(color+" = Tabla del 2");
		    	break;
		    case "Morado":
		    	System.out.println(color+" = Tabla del 7");
		        break;
		    case "Rosa":
		    	System.out.println(color+" = Tabla del 9");
		        break; 
		    case "Azul":
		    	System.out.println(color+" = Tabla del 6");
		    	break;
		    case "Blanco":
		    	System.out.println(color+" = Tabla del 12");
		    	break;
		    	default:
		    		System.out.println("Ese color no existe");
		    		break;
		    }

	}
	
	
	
	
}

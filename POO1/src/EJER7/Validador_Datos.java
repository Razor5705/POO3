package EJER7;

public class Validador_Datos {

	public static void main(String[] args) {
		String cadena1 = "123";
        String cadena2 = "abc";
        int numero1 = 5;
        int numero2 = 15;		
        
        System.out.println("¿La cadena \"" + cadena1 + "\" es un número? " + Validador.esNumero(cadena1));
        System.out.println("¿La cadena \"" + cadena2 + "\" es un número? " + Validador.esNumero(cadena2));

        System.out.println("¿El número " + numero1 + " está en el rango? " + Validador.EstaenRango(numero1, 1, 10));
        System.out.println("¿El número " + numero2 + " está en el rango? " + Validador.EstaenRango(numero2, 1, 10));

	}

	
}

class Validador {
	  public static boolean esNumero(String cadena) {
	        try {
	            Double.parseDouble(cadena);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	  
	  public static boolean EstaenRango(int numero, int rangoinicio, int rangofin) {
	        return numero >= rangoinicio && numero <= rangofin;
	  }
}
package EJER7;

public class ContadorMetodos {

	public static void main(String[] args) {
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
     Llamadas.Metodo();
		System.out.println("----------------------------------------");

     
     System.out.println("Numero de veces que se llamaron los metodos: " + Llamadas.llamadasMetodos());

	}

}

class Llamadas {
	
	private static int llamadas = 0;
	
	public static void Metodo () {
		System.out.println("");
		System.out.println("Realizando un metodo de operacion simple");
		llamadas++;
		
	}
	
	public static int llamadasMetodos () {
		return 
		  llamadas++;
	}
	
	
}
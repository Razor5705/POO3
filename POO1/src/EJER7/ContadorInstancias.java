package EJER7;

public class ContadorInstancias {

	public static void main(String[] args) {
    Contador instancia1 = new Contador();
    System.out.println("El Numero de Instancias: " + Contador.obtenerContador());
    Contador instancia2 = new Contador();
    System.out.println("El Numero de Instancias: " + Contador.obtenerContador());
    Contador instancia3 = new Contador();
    System.out.println("El Numero de Instancias: " + Contador.obtenerContador());
    Contador instancia4 = new Contador();
    System.out.println("El Numero de Instancias: " + Contador.obtenerContador());
    Contador instancia5 = new Contador();
    System.out.println("El Numero de Instancias: " + Contador.obtenerContador());
	}

}

class Contador {
	private static int instancias = 0;
	
	public Contador () {
		instancias++;
	}
	
	  public static int obtenerContador() {
	     return instancias;
	 }
	  
	  
}

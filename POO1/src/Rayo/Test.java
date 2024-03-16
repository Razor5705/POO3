package Rayo;

public class Test {

	public static void cadenita (int numero) {
		String cadenita = "0123456789ABCDEF";
		String cadena = "";
		
		while(numero > 0) {
			cadena = cadenita.charAt(numero%16) + cadena;
			numero = (int) (numero /16);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo cronometro1 = new Tiempo(1, 30, 20);
		char cadena;
		System.out.println(cronometro1);

		cronometro1.suma();
		System.out.println(cronometro1);

		cronometro1.resta();
		System.out.println(cronometro1);
		
		
	}

}

package EJER7;

public class Calculadora_Simple {

	public static void main(String[] args) {
	System.out.println(Calculadora.suma(2, 4));
   System.out.println(Calculadora.resta(8, 2));
   System.out.println(Calculadora.multiplicacion(4, 6));
   System.out.println(Calculadora.division(10, 5));

}
	
}

class Calculadora {
	
	public static String suma(int num1, int num2) {
		     return " La Suma es: " + ( num1 + num2);
		 }
	
	public static String resta(int num1, int num2) {
	     return " La resta es: " + (num1 - num2);
	 }
	
	public static String multiplicacion(int num1, int num2) {
	     return " La multiplicacion es: " + (num1 * num2);
	 }
	
	public static String division(int num1, int num2) {
	     return " La division es: " + (num1 / num2);
	 }
		  
}



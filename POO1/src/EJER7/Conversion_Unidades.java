package EJER7;

public class Conversion_Unidades {

	public static void main(String[] args) {
   ConvertorUnidades Unidad1 = new ConvertorUnidades();
	System.out.println(Unidad1.Primer(2.0, 0.0));
	ConvertorUnidades Unidad2 = new ConvertorUnidades();
	System.out.println(Unidad2.Segund(2.0, (float) 0.0));

	}

}

class ConvertorUnidades {
	
	public static String Primer (double kilometros, double millas) {
	    millas = 1.609;
		return " La Conversion de km a millas es: " + (kilometros / millas );
		
	}
	
	public static String Segund (double celsius, float fahrenheit) {
		return " La Conversion de grados celsius a fahrenheit es: " + ((1.8f * celsius) + 32);
		
	}
}

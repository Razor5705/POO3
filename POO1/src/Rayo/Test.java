package Rayo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo cronometro1 = new Tiempo(1, 30, 20);
		System.out.println(cronometro1);

		cronometro1.suma();
		System.out.println(cronometro1);

		cronometro1.resta();
		System.out.println(cronometro1);
	}

}

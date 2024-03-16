package NO_MORIRE;

public class Personaje {

	public String nombre;
	private int edad;
	private String textura;
	
	
	
	public Personaje(int edad, String textura) {
		this.edad = edad;
		this.textura = textura;
	}
	
	public Personaje() {
		
	}
	
	
	public String getTextura() {
		return textura;
	}
	public void setTextura(String textura) {
		this.textura = textura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

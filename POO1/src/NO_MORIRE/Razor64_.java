package NO_MORIRE;

public class Razor64_ extends Personaje implements Inventario{
   
	private String nombre;

	
	public Razor64_(int edad, String textura, String nombre) {
		super(edad, textura);
		this.nombre = "Razor64_";
	}

	public Razor64_(int edad, String textura) {
		super(edad, textura);	
		}

	public String getNombre() {
		return "Razor64_";
	}

	public void setNombre(String nombre) {
		this.nombre = "Razor64_";
	}

	@Override
	public String toString() {
		return " Ha entrado al mundo " + "\nSkin: "+ getTextura() + "\nEdad: " + getEdad()
			    + " ";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
			System.out.println("Menu Abierto");
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Has movido un objeto");
	}

	@Override
	public void seleccionar() {
		// TODO Auto-generated method stub
	System.out.println("Objeto Seleccionado");

	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		System.out.println("Menu Cerrado");
	}

	@Override
	public void tirar() {
		// TODO Auto-generated method stub
		System.out.println("Objeto Tirado"	);
	}
	
}

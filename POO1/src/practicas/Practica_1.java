package practicas;

public class Practica_1 {

	public static void main(String[] args) {
	CorreoElectronico Correo = new CorreoElectronico("Lucas", "Deseo enviarte este mensaje, este mensajeeee", "Tarea");
	SMS numero = new SMS("Messi","Ojala vuelvas al barça", 200);
    NotificarApp aplicacion = new NotificarApp("Nikolas", "Nueva Temporada de Brawl Stars", null);
	
    Correo.enviar();
    System.out.println();
    numero.enviar();
    System.out.println();
    aplicacion.enviar();
    System.out.println();
    
	}

}

abstract class Notificacion {
	String mensaje;
	String destinatario;
	abstract void enviar();
}

class CorreoElectronico extends Notificacion{

	String asunto;
	
	public CorreoElectronico (String destinatario, String mensaje, String asunto) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;
		this.asunto = asunto;
	}
		

	@Override
	void enviar() {
		// TODO Auto-generated method stub
		System.out.println("Destinatario: " + this.destinatario);
		System.out.println("Mensaje: " + this.mensaje);
       System.out.println("Asunto: " + this.asunto);
		
	}
	
}

class SMS extends Notificacion{

	int limiteCaracteres;
	
	public SMS (String destinatario, String mensaje, int limiteCaracteres) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;
  this.limiteCaracteres = limiteCaracteres;
	}
	
	@Override
	void enviar() {
		// TODO Auto-generated method stub
		System.out.println("Destinatario: " + this.destinatario);
		System.out.println("Mensaje: " + this.mensaje);
		System.out.println("El limite de Caracteres es: " + this.limiteCaracteres );
	}
	
}

class NotificarApp extends Notificacion{

	Boolean Identificador;
	
	public NotificarApp (String destinatario, String mensaje,  Boolean Identificador) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;
		this.Identificador = true;
	}
	
	@Override
	void enviar() {
		System.out.println("Destinatario: " + this.destinatario);
		System.out.println("Mensaje: " + this.mensaje);
		System.out.println("Identificador si es True o False: " + this.Identificador);
	}
	
}
package Coche;

public class Uso_Alarma {

	public static void main(String[] args) {
	     RelojAlarma miAlarma = new RelojAlarma();

	        // Establecer la hora de la alarma a las 8:00 AM
	        miAlarma.EstablecerHoraAlarma(8);

	        // Activar la alarma
	        miAlarma.activarAlarma();

	        // Actualizar la hora actual (simulado)
	        miAlarma.activarHoraActual();

	        // Comprobar si la alarma suena
	        miAlarma.comprobarAlarma();
	}

}

package Coche;

import java.util.Calendar;

public class RelojAlarma {

	private int HoraAlarma;
	private int HoraActual;
	private boolean AlarmaActivada;
	
	public RelojAlarma() {
		// CONSTRUCTOR
		
		this.HoraAlarma = 8;
		this.HoraActual = 0;
		this.AlarmaActivada = true;
	}
	
	public void EstablecerHoraAlarma(int hora) {
		this.HoraAlarma = hora;
	}
	
	public void activarAlarma() {
		this.AlarmaActivada = true;
	}
	
	public void desactivarAlarma() {
		this.AlarmaActivada = false;
	}
	
	public void activarHoraActual() {
		
		Calendar calendar = Calendar.getInstance();
		this.HoraActual = calendar.get(Calendar.HOUR_OF_DAY);
	}
	
	public void comprobarAlarma() {
        if (AlarmaActivada && HoraActual == HoraAlarma) {
            System.out.println("¡Alarma en juego!");
        } else {
            System.out.println("No hay alarma o no coincide nada.");
        }
    }

}

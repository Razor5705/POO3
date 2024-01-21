/*package Coche;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	 private List<Habitacion> habitaciones;
	
	
	// SETTERS
	public Hotel() {
		this.habitaciones = new ArrayList<>();
		for (int i = 0; i < habitaciones; i++) {
            if (i % 3 == 0) {
                habitaciones = new Habitacion(i + 1, "Suite");
            } else if (i % 2 == 0) {
                habitaciones = new Habitacion(i + 1, "Doble");
            } else {
                habitaciones = new Habitacion(i + 1, "Simple");
            }
		
	}


	public boolean verificarDisponibilidad(int Habitacion) {
	        return !habitaciones[Habitacion - 1].getOcupada();
	    }

	    public boolean reservarHabitacion(int Habitacion) {
	        if (!habitaciones[Habitacion - 1].getOcupada()) {
	            habitaciones[Habitacion - 1].OcuparHabi();
	            return true;
	        } else {
	            return false; // Habitación ocupada, no se puede reservar
	        }
	    }

	    public boolean cancelarReserva(int Habitacion) {
	        if (habitaciones[Habitacion - 1].getOcupada()) {
	            habitaciones[Habitacion - 1].OcuparHabi();
	            return true;
	        } else {
	            return false; // La habitación no estaba ocupada, no se puede cancelar
	        }
	    }
	
	   public void reserva(boolean OcuparHabi) {
		   
	   }
	
	/*public void agregar (int indice, Habitacion habi) {
		if (indice >= 0 && indice < habitaciones.length) {
			habitaciones[indice] = habi;
		} else {
			System.out.println("Indice fuera del rango");
		}*/

	/*	 public void agregar(Habitacion habi) {
		        habitaciones.add(habi);
		    }

	
}

*/



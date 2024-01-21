package Coche;

public class Hotel1 {
	private habitacion1[] habitaciones;

    public Hotel1(int numHabitaciones) {
        habitaciones = new habitacion1[numHabitaciones];
        for (int i = 0; i < numHabitaciones; i++) {
            if (i % 3 == 0) {
                habitaciones[i] = new habitacion1(i + 1, "Suite");
            } else if (i % 2 == 0) {
                habitaciones[i] = new habitacion1(i + 1, "Doble");
            } else {
                habitaciones[i] = new habitacion1(i + 1, "Simple");
            }
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de habitaciones:");
        for (habitacion1 habitacion1 : habitaciones) {
            System.out.println("Habitación " + habitacion1.getNumero() + " ("
        + habitacion1.getTipo() +") : "
                    + (habitacion1.estaOcupada() ? "Ocupada" : "Disponible"));
        }
    }

    public void reservarHabitacion(int numero) {
        for (int i = 0; i < 1; i++) {
    	if (numero >= 1 && numero <= habitaciones.length) {
            habitacion1 habitacion1 = habitaciones[numero - 1];
            if (!habitacion1.estaOcupada()) {
                habitacion1.reservar();
            } else {
                System.out.println("La habitación " + numero + " ya está ocupada.");
            }
        } else {
            System.out.println("Número de habitación no válido.");
        }
        }
    }

    public void cancelarReservaHabitacion(int numero) {

    	if (numero >= 1 && numero <= habitaciones.length) {
            habitacion1 habitacion1 = habitaciones[numero - 1];
            if (habitacion1.estaOcupada()) {
                habitacion1.cancelarReserva();
            } else {
                System.out.println("La habitación " + numero + " no está reservada.");
            }
        } else {
            System.out.println("Número de habitación no válido.");
        }
    }
        
}

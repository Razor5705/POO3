package Coche;

public class habitacion1 {

	 private int numero;
	    private String tipo;
	    private boolean ocupada;

	    public habitacion1(int numero, String tipo) {
	        this.numero = numero;
	        this.tipo = tipo;
	        this.ocupada = false;
	    }

	    public int getNumero() {
	        return numero;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public boolean estaOcupada() {
	        return ocupada;
	    }

	    public void reservar() {
	        ocupada = true;
	        System.out.println("Habitación " + numero + " reservada.");
	    }

	    public void cancelarReserva() {
	        ocupada = false;
	        System.out.println("Reserva de la habitación " + numero + " cancelada.");
	    }
	}


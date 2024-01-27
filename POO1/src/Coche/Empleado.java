package Coche;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;

    // Constructor
    public Empleado(String nombre, double sueldo, int añoContrato, int mesContrato, int diaContrato) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = LocalDate.of(añoContrato, mesContrato, diaContrato);
    }

    // METODOS/GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

 
    public void subeSueldo(double porcentaje) {
	        sueldo += sueldo * (porcentaje / 100);
	    }
 
    
	
}


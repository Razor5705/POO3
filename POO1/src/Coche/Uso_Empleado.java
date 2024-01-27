package Coche;

import java.time.LocalDate;
import java.util.ArrayList;

public class Uso_Empleado {

	public static void main(String[] args) {
		ArrayList<Empleado> Empleado = new ArrayList<Empleado>(); 

		
		Empleado empleado1 = new Empleado("Nikolas", 3000.0, 2022, 1, 1);
	    Empleado empleado2 = new Empleado("Lucas", 2700.0, 2023, 5, 15);
	    Empleado empleado3 = new Empleado("Messi", 50000.0, 2024, 1, 2);
	    
		Empleado empleado4 = new Empleado("Lamine", 2000.0, 2019, 6, 18);
	    Empleado empleado5 = new Empleado("Kyle Jackson", 4200.0, 2020, 5, 15);
	    Empleado empleado6 = new Empleado("Pancho", 5000.0, 2010, 5, 7);

	    Empleado.add(empleado1);
		Empleado.add(empleado2);
		Empleado.add(empleado3);
		
		Empleado.add(empleado4);
		Empleado.add(empleado5);
		Empleado.add(empleado6);


	        String nombreEmpleado = empleado1.getNombre();
	        double sueldoEmpleado = empleado1.getSueldo();
	        LocalDate fechaContratoEmpleado = empleado1.getFechaContrato();
	        
	

	        System.out.println("Nombre del empleado: " + nombreEmpleado);
	        System.out.println("Sueldo del empleado: " + sueldoEmpleado);
	        System.out.println("Fecha de contrato del empleado: " + fechaContratoEmpleado);
	        System.out.println();

	        empleado1.subeSueldo(10);
	        
	        
	   
	        
	        // OBJETO 1
	        double nuevosueldo = empleado1.getSueldo();
	        
	        // OBJETO 2
	        LocalDate fechaContratoEmpleado1 = empleado1.getFechaContrato();
	        LocalDate fechaContratoEmpleado2 = empleado2.getFechaContrato();
	        
	        Empleado empleadoContratadoPrimero = null;
	        for (Empleado empleado : Empleado) {
	            if (empleadoContratadoPrimero == null || empleado.getFechaContrato().isBefore(empleadoContratadoPrimero.getFechaContrato())) {
	                empleadoContratadoPrimero = empleado;
	            }
	        }

	        System.out.println();
	        System.out.println("El nuevo sueldo se aumentó en " + nuevosueldo);
	        System.out.println();

	        System.out.println("Fecha de contrato del empleado 1: " + fechaContratoEmpleado1);
	        System.out.println("Fecha de contrato del empleado 2: " + fechaContratoEmpleado2);
	        System.out.println();
	        
	        System.out.println("El empleado contratado primero es: " + empleadoContratadoPrimero.getNombre());
	        System.out.println();

	     // FOR EACH
	        for (Empleado Lista : Empleado) {
	        	System.out.println(Lista.getNombre());
	        	System.out.println(Lista.getSueldo());
	        }


		        	
		// FOR EACH
	
		        for (Empleado empleado : Empleado) {
		            if (empleado.getFechaContrato().getYear() < 2021) {
		                empleado.subeSueldo(5);
		            }
		        }   
		         
		 
			        
	 System.out.println("Nombres y sueldos actualizados:");
    for (Empleado empleado : Empleado) {
        System.out.println("Nombre: " + empleado.getNombre() + ", Sueldo: " + empleado.getSueldo());
	        	
	
	

    }
	
	
}
	
}



package Coche;

import java.util.Scanner;

public class Uso_Hotel1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  

		
		Hotel1 hotel = new Hotel1(10);

	        hotel.mostrarDisponibilidad();
           
	        for (int i = 0; i < 10; i++) {    	
	       System.out.println("Ingrese la habitacion a reservar");
	       int numero = sc.nextInt();
	        
			{
	       
	        System.out.println(" ");
	        hotel.reservarHabitacion(numero);
		       System.out.println("");

	        } 
	        }
	        
	        hotel.mostrarDisponibilidad();
	        
	        for (int i = 0; i < 10; i++) {
	        

		   System.out.println("Ingrese la habitacion a cancelar");
	       int numero1 = sc.nextInt();
	        hotel.cancelarReservaHabitacion(numero1);

		       System.out.println("");
	        hotel.mostrarDisponibilidad();
	        
	        }
	        
		
		
	    }
	}


package ABSTRACT;

public class MediodeTransporte {

	public static void main(String[] args) {
		 Vehiculo automovil = new Automovil();
	        Vehiculo motocicleta = new Motocicleta();

	        automovil.acelerar();
	        automovil.frenar();

System.out.println();
	        
	        motocicleta.acelerar();
	        motocicleta.frenar();
	}

}

abstract class Vehiculo {
	    abstract void acelerar();
	    abstract void frenar();
	}

	class Automovil extends Vehiculo {

		@Override
		void acelerar() {
			System.out.println("El automóvil está acelerando.");			
		}

		@Override
		void frenar() {
			System.out.println("El automóvil está frenando.");
			
		}
		
	}
	
	class Motocicleta extends Vehiculo {

		@Override
		void acelerar() {
			System.out.println("La motocicleta está acelerando.");			
					
		}

		@Override
		void frenar() {
			System.out.println("La motocicleta está frenando.");			
			
		}
		
	}

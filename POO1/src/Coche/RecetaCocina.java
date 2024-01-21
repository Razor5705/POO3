package Coche;

public class RecetaCocina {


		
		private String[] ingredientes; 
		private String[] pasos; 
		private int numIngredientes; 
		private int numPasos; 

		// Constructor 
		public RecetaCocina(int maximo, int maximoP) {

			// Inicializacion de variables
			ingredientes = new String[maximo];
			pasos = new String[maximoP];
			numIngredientes = 0;
			numPasos = 0;
		}

		// Métodos
		public void añadirIngrediente(String ingrediente) {
			if (numIngredientes < ingredientes.length) {
				ingredientes[numIngredientes] = ingrediente;
				numIngredientes++;
			} else {
				System.out.println("No se puede añadir más ingredientes. La Receta esta completa.");
			}
		}

	
		public void eliminarIngrediente(String ingrediente) {
			for (int i = 0; i < numIngredientes; i++) {
				if (ingredientes[i].equalsIgnoreCase(ingrediente)) {
					for (int j = i; j < numIngredientes - 1; j++) {
						ingredientes[j] = ingredientes[j + 1];
					}
					ingredientes[numIngredientes - 1] = null; // último elemento como nulo
					numIngredientes--; // Número de ingredientes
					return;
				}
			}
			System.out.println("Ingrediente no encontrado.");
		}

		public void añadirPaso(String paso) {
			if (numPasos < pasos.length) {
				pasos[numPasos] = paso; 
				numPasos++; 
			} else {
				System.out.println("Ya no se pueden añadir más pasos .");
			}
		}

		public void mostrarReceta() {
			System.out.println("Receta de Puré de Patatas:");

			System.out.println("Ingredientes que necesito:");
			for (int i = 0; i < numIngredientes; i++) {
				System.out.println("- " + ingredientes[i]);
			}

			System.out.println("\nPasos a seguir:");
			for (int i = 0; i < numPasos; i++) {
				System.out.println((i + 1) + ". " + pasos[i]);
			}
		}
	}

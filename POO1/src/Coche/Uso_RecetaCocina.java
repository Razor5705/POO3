package Coche;

public class Uso_RecetaCocina {

	public static void main(String[] args) {
		RecetaCocina Pure = new RecetaCocina(7, 6);

		// Mostrar los ingredientes
		Pure.añadirIngrediente("Patatas");
		Pure.añadirIngrediente("Agua");
		Pure.añadirIngrediente("Sal");
		Pure.añadirIngrediente("Leche");
		Pure.añadirIngrediente("Ajo");
		Pure.añadirIngrediente("Aceite");
		Pure.añadirIngrediente("Mantequilla");
	

		// Pasos para hacer el pure
		Pure.añadirPaso("Sancochar las patatas en una olla grande a nivel 7 de intensidad y esperar 30 min");
		Pure.añadirPaso("Sacar las patatas y luego se pelan para dejarlos en un bol");
		Pure.añadirPaso("Aplastar todas las patatas");
		Pure.añadirPaso("En una nueva olla, calentar el aderezo, se le echa ajo, aceite, sal, mantequilla y un poco de agua");
		Pure.añadirPaso("Luego de aplastar la patata y que precaliente el aderezo, echarlas en la olla");
		Pure.añadirPaso("Finalmente echar leche para agregarle mas liquido a la patata");

		// Mostrar la receta
		Pure.mostrarReceta();
	}

}

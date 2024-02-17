package ABSTRACT;

public class PersistenciaTotal {

	public static void main(String[] args) {
		Persistencia persistenciaArchivo = new PersistenciaArchivo();
        Persistencia persistenciaBaseDatos = new PersistenciaBaseDatos();

        persistenciaArchivo.guardarDatos("Datos para guardar en archivo");
        persistenciaBaseDatos.guardarDatos("Datos para guardar en base de datos");
        
        System.out.println();

        Object datosCargadosDesdeArchivo = persistenciaArchivo.cargarDatos();
        Object datosCargadosDesdeBaseDatos = persistenciaBaseDatos.cargarDatos();

        System.out.println();
        
        System.out.println("Datos cargados desde archivo: " + datosCargadosDesdeArchivo);
        System.out.println("Datos cargados desde base de datos: " + datosCargadosDesdeBaseDatos);
	}

}

abstract class Persistencia {
    abstract void guardarDatos(Object datos);
    abstract Object cargarDatos();
}

class PersistenciaArchivo extends Persistencia {
    @Override
    void guardarDatos(Object datos) {
        System.out.println("Guardando datos en archivo: " + datos);
        // Lógica para guardar datos en un archivo
    }

    @Override
    Object cargarDatos() {
        System.out.println("Cargando datos desde archivo.");
        // Lógica para cargar datos desde un archivo
        return null; // Retorno ficticio para demostración
    }
}

class PersistenciaBaseDatos extends Persistencia {
    @Override
    void guardarDatos(Object datos) {
        System.out.println("Guardando datos en la base de datos: " + datos);
        // Lógica para guardar datos en una base de datos
    }

    @Override
    Object cargarDatos() {
        System.out.println("Cargando datos desde la base de datos.");
        // Lógica para cargar datos desde una base de datos
        return null; // Retorno ficticio para demostración
    }
}
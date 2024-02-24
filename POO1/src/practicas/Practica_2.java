package practicas;

public class Practica_2 {

	public static void main(String[] args) {
		EmpleadoPermanente Emp1 = new EmpleadoPermanente("Nikolas", 10);
		EmpleadoPermanente Emp2 = new EmpleadoPermanente("Lucas", 4, 2500);
		EmpleadoTemporal Emp3 = new EmpleadoTemporal("Gavi", 8, 3);
		Contratista Emp4 = new Contratista("Messi", 25, 4);

		Emp1.mostrarDetalles();
		Emp2.mostrarDetalles();
		Emp3.mostrarDetalles();
		Emp4.mostrarDetalles();
		
		
	}

}


 abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
}

 class EmpleadoPermanente extends Empleado {
    private double beneficiosAdicionales;

    public EmpleadoPermanente(String nombre, int id) {
        super(nombre, id);
    }

    public EmpleadoPermanente(String nombre, int id, double salario) {
        super(nombre, id, salario);
    }

    public EmpleadoPermanente(String nombre, int id, double salario, double beneficiosAdicionales) {
        super(nombre, id, salario);
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    @Override
    public double calcularSalario() {
        return salario + beneficiosAdicionales;
    }

    @Override
    public void mostrarDetalles() {
        // Implementación del método
    	
    }
}

 class EmpleadoTemporal extends Empleado {
    private int periodoContrato;

    public EmpleadoTemporal(String nombre, int id, int periodoContrato) {
        super(nombre, id);
        this.setPeriodoContrato(periodoContrato);
    }

    public EmpleadoTemporal(String nombre, int id, double salario, int periodoContrato) {
        super(nombre, id, salario);
        this.setPeriodoContrato(periodoContrato);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void mostrarDetalles() {
System.out.println();
    }

	public int getPeriodoContrato() {
		return periodoContrato;
	}

	public void setPeriodoContrato(int periodoContrato) {
		this.periodoContrato = periodoContrato;
	}
}

 class Contratista extends Empleado {
    private int periodoContrato;

    public Contratista(String nombre, int id, int periodoContrato) {
        super(nombre, id);
        this.setPeriodoContrato(periodoContrato);
    }

    public Contratista(String nombre, int id, double salario, int periodoContrato) {
        super(nombre, id, salario);
        this.setPeriodoContrato(periodoContrato);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println();
    }

	public int getPeriodoContrato() {
		return periodoContrato;
	}

	public void setPeriodoContrato(int periodoContrato) {
		this.periodoContrato = periodoContrato;
	}
}
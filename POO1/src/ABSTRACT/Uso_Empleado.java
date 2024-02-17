package ABSTRACT;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		 Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto(4500);
	        Empleado empleadoTiempoParcial = new EmpleadoTiempoParcial(22, 15);
	        
	        System.out.println();

	        System.out.println("Salario del empleado a tiempo completo: $" + empleadoTiempoCompleto.calcularSalario());
	        System.out.println("Salario del empleado a tiempo parcial: $" + empleadoTiempoParcial.calcularSalario());
	}

}


abstract class Empleado {
    abstract double calcularSalario();
}

class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    double calcularSalario() {
        // Para un empleado a tiempo completo, el salario es el mismo cada mes
        return salarioMensual;
    }
}

class EmpleadoTiempoParcial extends Empleado {
    private double horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoTiempoParcial(double horasTrabajadas, double salarioPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    double calcularSalario() {
        // Para un empleado a tiempo parcial, el salario es el producto de las horas trabajadas y el salario por hora
        return horasTrabajadas * salarioPorHora;
    }
}

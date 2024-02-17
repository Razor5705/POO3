package ABSTRACT;

import javax.swing.JOptionPane;

public class Figura {

	public static void main(String[] args) {
		
		double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del rectángulo:"));
        double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del rectángulo:"));

        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + rectangulo.calculararea());

        // Entrada de datos para el círculo
        double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));

        // Crear objeto círculo
        Circulo circulo = new Circulo(radioCirculo);

        // Calcular y mostrar área del círculo
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + circulo.calculararea());
		
	
	
	}

}

abstract class FiguraGeometrica {
	abstract double calculararea();
}

	class Rectangulo extends FiguraGeometrica {
	    private double base;
	    private double altura;

	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    @Override
	    double calculararea() {
	        return base * altura;
	    }
	}

	class Circulo extends FiguraGeometrica {
	    private double radio;

	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	    @Override
	    double calculararea() {
	        return Math.PI * radio * radio;
	    }
	}
	
	


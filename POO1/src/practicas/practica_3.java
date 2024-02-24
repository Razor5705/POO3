package practicas;

public class practica_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


 abstract class FiguraGeometrica {
    protected String colorLinea;
    protected String colorRelleno;

    public FiguraGeometrica() {
        this.colorLinea = "negro";
        this.colorRelleno = "blanco";
    }

    public FiguraGeometrica(String colorLinea, String colorRelleno) {
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
    }

    public abstract void dibujar();
    public abstract double calcularArea();
}

 class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(double radio, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
    	
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

 class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
    	
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

 class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
    	
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

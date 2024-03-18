package Animal;

public class Fracciones {


}

class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invierte() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    public void simplifica() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    public void multiplica(Fraccion otraFraccion) {
        numerador *= otraFraccion.numerador;
        denominador *= otraFraccion.denominador;
    }

    public void divide(Fraccion otraFraccion) {
        numerador *= otraFraccion.denominador;
        denominador *= otraFraccion.numerador;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(3, 6);
        Fraccion fraccion2 = new Fraccion(4, 8);

        System.out.println("Fracciones originales:");
        System.out.println("Fracción 1: " + fraccion1.numerador + "/" + fraccion1.denominador);
        System.out.println("Fracción 2: " + fraccion2.numerador + "/" + fraccion2.denominador);

        fraccion1.invierte();
        fraccion2.simplifica();
        fraccion1.multiplica(fraccion2);
        fraccion2.divide(fraccion1);

        System.out.println("\nFracciones modificadas:");
        System.out.println("Fracción 1: " + fraccion1.numerador + "/" + fraccion1.denominador);
        System.out.println("Fracción 2: " + fraccion2.numerador + "/" + fraccion2.denominador);
    }
}
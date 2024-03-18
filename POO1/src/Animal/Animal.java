package Animal;

public class Animal {

	 public static void main(String[] args) {
	        Cat gato = new Cat("Pelusa");
	        Dog perro = new Dog("Max");
	        Canary canario = new Canary("Sol");
	        Penguin pinguino = new Penguin("Frío");
	        Lizard lagarto = new Lizard("Escamoso");

	        gato.speak();
	        perro.speak();
	        canario.fly();
	        pinguino.swim();
	        lagarto.crawl();
	    }

}

class Animales {
    String name;

    public Animales(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " hace un sonido.");
    }
}

class Mammal extends Animales {
    public Mammal(String name) {
        super(name);
    }

    public void feedMilk() {
        System.out.println(name + " alimenta a sus crías con leche.");
    }
}

class Bird extends Animales {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " puede volar.");
    }
}

class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " dice 'Miau'.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " dice 'Guau guau'.");
    }
}

class Canary extends Bird {
    public Canary(String name) {
        super(name);
    }

    public void sing() {
        System.out.println(name + " canta hermosamente.");
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(name + " es un gran nadador.");
    }
}

class Lizard extends Animales {
    public Lizard(String name) {
        super(name);
    }

    public void crawl() {
        System.out.println(name + " se arrastra por el suelo.");
    }
}

   

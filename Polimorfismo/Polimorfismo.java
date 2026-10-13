class Animal {
    void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido();
        a2.hacerSonido();
    }
}
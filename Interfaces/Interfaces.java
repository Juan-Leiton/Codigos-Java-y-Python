interface Animal {
    void hacerSonido();
}

class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido();
    }
}
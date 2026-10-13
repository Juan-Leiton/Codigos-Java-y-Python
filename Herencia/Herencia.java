//Clase padre
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

//Clase hija
class Perro extends Animal {
    void ladrar() {
        System.out.println("¡Guau, guau!");
    }
}

//Clase principal
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro();

        miPerro.hacerSonido(); //Método heredado
        miPerro.ladrar();      //Método propio
    }
}
class Motor {
    void encender() {
        System.out.println("Motor encendido");
    }
}

class Automovil {
    private Motor motor = new Motor();

    void arrancar() {
        motor.encender();
        System.out.println("Automóvil en marcha");
    }
}

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.arrancar();
    }
}
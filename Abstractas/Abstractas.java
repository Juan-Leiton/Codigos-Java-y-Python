abstract class Figura {
    abstract double calcularArea();
}

class Cuadrado extends Figura {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(4);
        System.out.println(c.calcularArea());
    }
}
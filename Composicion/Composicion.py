class Motor:
    def encender(self):
        print("Motor encendido")

class Automovil:
    def __init__(self):
        self.motor = Motor()

    def arrancar(self):
        self.motor.encender()
        print("Automóvil en marcha")

auto = Automovil()
auto.arrancar()
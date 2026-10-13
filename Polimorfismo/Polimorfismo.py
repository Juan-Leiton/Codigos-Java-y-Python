class Animal:
    def hacer_sonido(self):
        print("Sonido de animal")

class Perro(Animal):
    def hacer_sonido(self):
        print("Guau")

class Gato(Animal):
    def hacer_sonido(self):
        print("Miau")

a1 = Perro()
a2 = Gato()

a1.hacer_sonido()
a2.hacer_sonido()
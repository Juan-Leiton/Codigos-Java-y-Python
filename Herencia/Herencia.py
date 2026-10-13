# Clase padre
class Animal:
    def hacer_sonido(self):
        print("El animal hace un sonido")

# Clase hija
class Perro(Animal):
    def ladrar(self):
        print("¡Guau, guau!")

# Programa principal
mi_perro = Perro()

mi_perro.hacer_sonido()  # Método heredado
mi_perro.ladrar()        # Método propio
class Calculadora:
    def sumar(self, a, b, c=0):
        return a + b + c

calc = Calculadora()

print(calc.sumar(2, 3))
print(calc.sumar(2, 3, 4))
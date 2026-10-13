class CuentaBancaria:
    def __init__(self):
        self.__saldo = 0

    def depositar(self, cantidad):
        if cantidad > 0:
            self.__saldo += cantidad

    def obtener_saldo(self):
        return self.__saldo

cuenta = CuentaBancaria()
cuenta.depositar(100)

print(cuenta.obtener_saldo())
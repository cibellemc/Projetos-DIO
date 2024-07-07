from historico import Historico
from transacao import Saque

class Conta:

    def __init__(self, numero, cliente):
        self._saldo = 0
        self._agencia = "0001"
        self._numero = numero
        self._cliente = cliente
        self._historico = Historico()

    @classmethod
    def nova_conta(cls, cliente, numero):
        return cls(numero, cliente) # retorna uma instância de conta
    
    @property
    def saldo(self):
        return self._saldo
    
    @property
    def agencia(self):
        return self._agencia
    
    @property
    def numero(self):
        return self._numero
    
    @property
    def cliente(self):
        return self._cliente
    
    @property
    def historico(self):
        return self._historico
    
    def sacar(self, valor):
        if valor <= self._saldo and valor > 0:
            self._saldo -= valor
            return True
        else: 
            print("Não foi possível realizar saque. Informe um valor positivo menor que seu saldo em conta.")
            return False

    def depositar(self, valor):
        if valor >= 0: 
            self._saldo += valor
            return True
        else: 
            print("Infore um valor maior que 0!")
            return False
    

class ContaCorrente(Conta):

    def __init__(self, numero, cliente, limite=500, limite_saques=3):
        super().__init__(numero, cliente)
        self._limite = limite
        self._limite_saques = limite_saques

    def sacar(self, valor): # sobrescrita porque precisa de validações
        numero_saques = len([transacao for transacao in self._historico._transacoes if transacao['tipo'] == Saque.__name__])

        if valor > self._limite:
            print("Operação falhou! Valor de saque excedido.")
        elif numero_saques > self._limite_saques:
            print("Operação falhou! Número de saques excedidos.")
        else:
            return super().sacar(valor)
        
        return False
    
    def __str__(self):
        return f"Agência: {self._agencia}\nConta Corrente: {self._numero}\nTitular: {self.cliente._nome}"
    
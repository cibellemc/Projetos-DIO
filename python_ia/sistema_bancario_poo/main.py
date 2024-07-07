import textwrap
from cliente import PessoaFisica
from conta import ContaCorrente
from transacao import Deposito, Saque

def menu():
    print("\n")
    print(" MENU ".center(20, "#"))
    print("[1] Cadastrar cliente\n[2] Abrir conta corrente\n[3] Depositar\n[4] Sacar\n[5] Extrato\n[6] Listar contas\n[0] Sair\n")

    opcao = int(input("Opção desejada: "))
    return opcao

def filtrar_cliente(cpf, clientes):
    cliente = [cliente for cliente in clientes if cliente._cpf == cpf]
    return cliente[0] if cliente else None

def recuperar_conta_cliente(cliente):
    if not cliente._contas:
        print("Cliente não possui contas.")
        return
    
    return cliente._contas[0] # não permite escolha de contas, pode ser corrigido

def criar_cliente(clientes):
    cpf = input("CPF: ")
    cliente = filtrar_cliente(cpf, clientes)

    if cliente:
        print("Cliente já cadastrado!")
        return


    nome = input("Nome: ")
    endereco = input("Endereço: ")
    data_nascimento = input("Data de nascimento: ")

    cliente = PessoaFisica(nome, data_nascimento, cpf, endereco)

    clientes.append(cliente)
    print("Cliente cadastrado com sucesso!")

def criar_conta(num_conta, clientes, contas):
    cpf = input("Digite o CPF do cliente: ")
    cliente = filtrar_cliente(cpf, clientes)

    if not cliente:
        print("Cliente não encontrado, fluxo encerrado.")
        return

    conta = ContaCorrente.nova_conta(cliente=cliente, numero=num_conta)
    contas.append(conta)
    cliente._contas.append(conta)

    print("\nConta criada com sucesso!")

def listar_contas(contas):
    for conta in contas:
        print("----------------------")
        print((str(conta)))

def sacar(clientes):
    cpf = input("CPF: ")
    cliente = filtrar_cliente(cpf, clientes)

    if not cliente:
        print("Cliente não encontrado.")
        return
    
    valor = float(input("Valor do saque: "))
    transacao = Saque(valor)

    conta = recuperar_conta_cliente(cliente)

    if not conta:
        return
    
    cliente.realizar_transacao(conta, transacao)

def depositar(clientes):

    cpf = input("CPF: ")
    cliente = filtrar_cliente(cpf, clientes)

    if not cliente:
        print("Cliente não encontrado.")
        return
    
    valor = float(input("Valor do depósito: "))
    transacao = Deposito(valor)

    conta = recuperar_conta_cliente(cliente)

    if not conta:
        return
    
    cliente.realizar_transacao(conta, transacao)

def exibir_extrato(clientes):

    cpf = input("CPF: ")
    cliente = filtrar_cliente(cpf, clientes)
    if not cliente:
        return
    
    conta = recuperar_conta_cliente(cliente)
    if not conta:
        return
    
    print("---------- EXTRATO ----------")
    transacoes = conta.historico._transacoes
    extrato = ""
    if not transacoes:
        extrato = "Não foram realizadas transações."
    else:
        for transacao in transacoes:
            extrato += f"\n{transacao['tipo']}: R${transacao['valor']:.2f}"

    print(extrato)
    print(f"\nSaldo: R${conta.saldo:.2f}\n")

def main():
    clientes = []
    contas = []

    while True:
        opcao = menu()

        if opcao == 1:
            criar_cliente(clientes)
        elif opcao == 2:
            numero_conta = len(contas) + 1
            criar_conta(numero_conta, clientes, contas)
        elif opcao == 3:
            depositar(clientes)
        elif opcao == 4:
            sacar(clientes)
        elif opcao == 5:
            exibir_extrato(clientes)
        elif opcao == 6:
            listar_contas(contas)
        elif opcao == 0:
            print("Encerrando o programa...")
            break
        else:
            print("Operação inválida, por favor selecione novamente a operação desejada.")

if __name__ == "__main__":
    main()

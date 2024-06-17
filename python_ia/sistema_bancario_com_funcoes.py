def menu():
    print("\n")
    print(" MENU ".center(20, "#"))
    print("[1] Cadastrar cliente\n[2] Abrir conta corrente\n[3] Depositar\n[4] Sacar\n[5] Extrato\n[6] Listar contas\n[0] Sair\n")

    opcao = int(input("Opção desejada: "))
    return opcao

def criar_usuario(clientes):
    print("\nInforme os dados abaixo para cadastro de novo cliente:")

    cpf = input("CPF: ")
    if any(cliente['CPF'] == cpf for cliente in clientes):
        print("Usuário já cadastrado!")
        return clientes

    nome = input("Nome: ")
    endereco = input("Endereço: ")
    data_nascimento = input("Data de nascimento: ")

    clientes.append({"Nome": nome, "CPF": cpf, "Endereço": endereco, "Data de Nascimento": data_nascimento})
    print("Cliente cadastrado com sucesso!")
    return clientes

def criar_conta_corrente(clientes, contas, num_conta, agencia):
    cliente_cpf = input("Digite o CPF do cliente: ")

    if any(cliente['CPF'] == cliente_cpf for cliente in clientes):
        num_conta += 1
        contas.append({"Conta": num_conta, "Agência": agencia, "CPF": cliente_cpf})
        print("Conta criada com sucesso!")
    else:
        print("Usuário não encontrado!")

    return contas, num_conta

def saque(saldo, extrato, limite, numero_saques, limite_saques, valor):
    excedeu_saldo = valor > saldo
    excedeu_limite = valor > limite
    excedeu_saques = numero_saques >= limite_saques

    if excedeu_saldo:
        print("Operação falhou! Você não tem saldo suficiente.")
    elif excedeu_limite:
        print("Operação falhou! O valor do saque excede o limite.")
    elif excedeu_saques:
        print("Operação falhou! Número máximo de saques excedido.")
    elif valor > 0:
        saldo -= valor
        extrato += f"Saque: R$ {valor:.2f}\n"
        numero_saques += 1
        print("Saque realizado com sucesso!")
    else:
        print("Operação falhou! O valor informado é inválido.")

    return saldo, extrato, numero_saques

def deposito(saldo, valor, extrato):
    if valor > 0:
        saldo += valor
        extrato += f"Depósito: R$ {valor:.2f}\n"
        print("Depósito realizado com sucesso!")
    else:
        print("Operação falhou! O valor informado é inválido.")

    return saldo, extrato

def mostrar_extrato(saldo, extrato):
    print("\n================ EXTRATO ================")
    print("Não foram realizadas movimentações." if not extrato else extrato)
    print(f"\nSaldo:\t\tR$ {saldo:.2f}")
    print("==========================================")

def main():
    saldo = 0
    LIMITE = 500
    extrato = ""
    numero_saques = 0
    LIMITE_SAQUES = 3
    clientes = []
    contas = []
    num_conta = 0
    AGENCIA = "0001"

    while True:
        opcao = menu()

        if opcao == 1:
            clientes = criar_usuario(clientes)
        elif opcao == 2:
            contas, num_conta = criar_conta_corrente(clientes, contas, num_conta, AGENCIA)
        elif opcao == 3:
            valor = float(input("Informe o valor do depósito: "))
            saldo, extrato = deposito(saldo, valor, extrato)
        elif opcao == 4:
            valor = float(input("Informe o valor do saque: "))
            saldo, extrato, numero_saques = saque(saldo, extrato, LIMITE, numero_saques, LIMITE_SAQUES, valor)
        elif opcao == 5:
            mostrar_extrato(saldo, extrato)
        elif opcao == 6:
            print("\n==== LISTA DE CONTAS ====")
            for conta in contas:
                print(f"Conta: {conta['Conta']}, Agência: {conta['Agência']}, CPF: {conta['CPF']}")
            print("=========================")
        elif opcao == 0:
            print("Encerrando o programa...")
            break
        else:
            print("Operação inválida, por favor selecione novamente a operação desejada.")

if __name__ == "__main__":
    main()

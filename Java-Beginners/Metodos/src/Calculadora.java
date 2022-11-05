public class Calculadora {
    /**
     * classe = atributos + metodos (funções, subrotinas)
     * visibilidade: todo o sistema (public), privado (private), invisivel para outras classes (protected)
     * tipo de dado: concreto ou abstrato
     * modificador: static ou final
     * retorno: tipo de dado (primitivos: int, boolean) ou void 
     * nome do método: camelCase
     * parametros necessarios: por valor/cópia ou referência/endereço
     * exceções: necessário se atentar a tratamento de erros (ex: divisor não pode ser 0) 
     * corpo: código ou vazio (termina em;)
     * assinatura = nome + parametros (ou só o abrir e fechar de parênteses
     * construtor, destrutor: métodos especiais em OO
     * mensagem: solicitar que o método execute
     * os métodos só tem como obrigatorio o retorno e o nome
     */

    public int somar(int a, int b){ 
        return a+b; 
    }

    public static void soma(int a, int b){ 
        System.out.println("Soma: " + (a+b)); 
    }

    public int subtrair(int a, int b){ 
        return a-b; 
    }

    public static void subtracao(int a, int b){ 
        System.out.println("Subração: " + (a-b)); 
    }

    public int multiplicar(int a, int b){ 
        return a*b; 
    }

    public static void multiplicacao(int a, int b){ 
        System.out.println("Subração: " + (a*b)); 
    }

    public int dividir(int a, int b){ 
        return a/b; 
    }

    public static void divisao(int a, int b){ 
        System.out.println("Divisão: " + (a/b)); 
    }
}


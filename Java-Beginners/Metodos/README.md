## Comentários sobre métodos:

### Estrutura geral:
* classe = atributos + metodos (funções, subrotinas)
* visibilidade: 
    * todo o sistema - public, 
    * privado - private, 
    * invisivel para outras classes - protected
* tipo de dado: concreto ou abstrato
* modificador: static ou final
* retorno: tipo de dado (primitivos: int, boolean) ou void. 
    *  o tipo de retorno de um método deve ser compatível ao definido na criação
* nome do método: camelCase
* parametros necessarios: 
    * por valor/cópia 
    * por referência/endereço
* exceções: necessário se atentar a tratamento de erros (ex: divisor não pode ser 0) 
* corpo: código ou vazio (termina em;)
* assinatura = nome + parametros (ou só o abrir e fechar de parênteses)
* construtor, destrutor: métodos especiais em OO
* mensagem: solicitar que o método execute
* os métodos só tem como obrigatorio o retorno e o nome

### Sobrecarga:
* Capacidade de definir métodos para diferentes contextos, mas preservando seu nome 
* Muda-se a lista de parâmetros

#### Exemplo 1:
```
converterParaInteiro(String s);
converterParaInteiro(String s, RoundType rd);
converterParaInteiro(RoundType rd, String s);
converterParaInteiro();
```

#### Exemplo 2:
```
println()
println(String x)
println(char[] x)
```
#### Ao tentar sobrecarregar um método mudando apenas o nome, haverá erro de compilação:

```
// Duplicate method area(double, double, double)

public static void area(double baseMaior, double baseMenor, double altura){
    System.out.println("Área do trapézio: " + (baseMaior+baseMenor)*altura / 2); 
}

public static void area(double diagonalMaior, double diagonalMenor, double altura){
    System.out.println("Área do trapézio: " + (diagonalMaior+diagonalMenor)*altura / 2); 
} 

```

### Sobrescrita:
* Ligado à herança
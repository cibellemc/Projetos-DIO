> O que é OO:

Paradigma de análise (entender o problema), projeto (abstrair, criar modelo computacional) e programação (tradução através da linguagem), baseado na composição e interação entre diversas unidades de software chamadas de objetos.

> Fundamentos:

* Abstração: pensar nas características essenciais
    * Cadeira: praia, mesa, escritório
    * Livro:  Quantidade de páginas, Editora, Autor, Título, Assunto, ISBN
* Reuso: criar novas unidades de código a partir de outras já existentes,
* Encapsualamento: capacidade de esconder dados e complexidade

> Estruturas Básicas:

* Classe: abstrai um conjunto de objetos com caraterísticas similares. Define comportamentos e estados.
    * Substantivos, nomes significativos considerando contexto
* Atributo: características próprias a alguém/alguma coisa
    * Tipos adequados: verificar a finalidade
* Método: definem e realizam comportamentos. Executado quando é feita solicitação
    * verbos
    * métodos especiais: 
        * construtor: criar objetos, prover valores iniciais - nome obrigatoriamente igual a classe. Caso não necessite de parâmetros, não precisa ser definido explicitamente
        * destrutor: auxilia a destruição. Libera recurso da memória. 
    * int calcularTotal(), boolean ligar(), void frear(), void finalize()
    * sobrecarga: mudar assinatura (nome + parâmetros) de acordo com a necessidade
* Objeto: representação de conceito/entidade. Instância de classe.
    * variável do tipo da classe, new e construtor.
    ```
    Carro carro = new Carro();
    ```
* Mensagem: ativação do método. Requisição que dispara ação. Pode ocorrer via objeto e via classe
    ```
    carro.<metodo>;
    Carro.<metodo>
    ```



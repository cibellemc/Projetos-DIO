> Exception
Evento que interrompe o fluxo normal

É uma classe como qualquer outra

Com o tratamento, o programa pode continuar executando depois de lidar com o problema

Pensando no decorrer da escrita de classes

`Error`: não tem como tratar, porque não sabe onde pode estourar. Programa para abruptamente.
Ex: thread que já morreu

"Usado pela JVM, serve para indicar quando existe algum problema em um recurso do programa, tornando a execução impossível de continuar."

`Unchecked` (Runtime): erro de lógica. Compilador não prevê. Pode tratar ou não.

* Runtime < Exception < Throwable < Object
* Error < Throwable
* FileNotFoundException < IOException (as classes genéricas devem estar no catch de cima, pois caso fosse a mãe, sempre entraria nela e não trataria erros específicos)

`Checked Exception`: não herdam de RuntimeException devem ser evitados. O compilador já indica. 
Ex: fechar arquivo não aberto

> Tratamento de exceções:
* try, catch, finally: definem blocos de tratamento de exceções
* throws: método que lança uma ou várias exceções
* throw: lança explicitamente uma exception

I. Região onde se encontra o possível tratamento da exceção. - c
II. Região onde se encontra o código que queremos verificar se irá ou não lançar uma exceção. - t
III. Geralmente utilizado quando precisamos executar algum código independente se ocorrer exception ou não. - f

características apenas da cláusula “throws”:

I. É usada na assinatura do método
II. Necessária apenas para exceções checked.
III. É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código.
IV. Informa ao chamador do método que este método pode lançar uma das exceções listadas no escopo do método.  - I, II, IV
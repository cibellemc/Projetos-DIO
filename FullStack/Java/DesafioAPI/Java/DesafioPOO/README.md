# POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

## PlantUML

O **PlantUML** é uma ferramenta que permite a criação de diagramas UML (Unified Modeling Language) de maneira simples. Ele se destaca por sua abordagem textual: diagramas são criados usando uma linguagem de descrição em vez de uma interface gráfica.

## Por que usar o PlantUML?

1. **Simplicidade**: descreve diagramas usando uma sintaxe acessível mesmo para pessoas que não são especialistas em UML.

2. **Portabilidade**: diagramas podem ser facilmente compartilhados e versionados em sistemas de controle de código-fonte.

3. **Variedade de Diagramas**: Além de diagramas de classe e sequência, suporta muitos outros tipos de diagramas UML, incluindo diagramas de caso de uso e diagramas de atividade.

## Sintaxe Básica

A criação de um diagrama no PlantUML envolve algumas etapas simples:

1. **Instalação**: Você pode usar o PlantUML [online](https://www.planttext.com/) ou [instalá-lo](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml) localmente em sua máquina.


2. **Definição do Diagrama**: Use a sintaxe PlantUML para descrever os elementos do diagrama. Por exemplo, `class` é usado para criar uma classe em um diagrama de classe.

3. **Renderização**: O PlantUML processa seu código e gera automaticamente um diagrama visual, que pode ser exportado em vários formatos, como PNG, SVG e outros.

## Exemplo de Sintaxe

```\plantuml
@startuml MinhaClasse
class MinhaClasse {
  + atributo1: tipo1
  - atributo2: tipo2
  + método1(param: tipo): retorno
  - método2(param: tipo): retorno
}
@enduml
```

Neste exemplo, definimos uma classe chamada `MinhaClasse` com atributos e métodos.
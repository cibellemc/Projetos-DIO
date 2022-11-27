## Apache Maven
Muitas classes, pacotes, execução de testes (compilar e executar) via linha de código trazem problemas. Com o Maven, podemos compilar, executar automaticamente todas as classes Java da aplicação e empacotar projetos

## POM – Project Object Model
* Define como vai ser executada, quais dependências (frameworks, bibliotecas e respectivas versões)
* Facilita compreensão do desenvolvedor, verificar nível de complexidade

## Download e instalação Maven
1. maven.apache.org > Binary zip archive apache-maven-3.8.6-bin.zip
2. Movi para ProgramFIles (onde tá o Java, mas é opcional) >
3. Variáveis de ambiente > Path > add o caminho ate \bin
4. Testa com mvn –version

## Criação do primeiro projeto
```mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false```

## Maven archetype
Geração de um projeto com base em um template: definimos versão de comp,onentes, quais vão ser inseridos, organização de pacotes e arquivos

### Podemos procurar arquétipos para um projeto simples, projeto web, empacotamento ear
+	“maven archetype list” -> instruções de execução específica
https://maven.apache.org/archetypes/
+	“mvn repository” > archetype
+	Gitgub tem alguns que necessita clone

## Comandos úteis no dia a dia
> Compilar classes:
mvn compile:
todos são inseridos na pasta target

> Testar aplicação:
mvn teste:
encontra e executa todas as classes de teste
(BUILD SUCCESS ou BUILD FAILED

> Empacotar criando JAR:
mvn packege

> Limpar diretório de trabalho (target)
mvn clean
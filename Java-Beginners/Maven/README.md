## Apache Maven
Muitas classes, pacotes, execução de testes (compilar e executar) via linha de código trazem problemas. Com o Maven, podemos compilar, executar automaticamente todas as classes Java da aplicação e empacotar projetos

## POM – Project Object Model
* Nome do projeto, configurações de build, detalhes do projeto (nome, descrição, licença, url), configurações de ambiente (repositórios, tracking, profiles)
* Define como vai ser executada, quais dependências (frameworks, bibliotecas e respectivas versões)
* Facilita compreensão do desenvolvedor, verificar nível de complexidade
* Unidade fundamental de trabalho
* Formato XML
* O Maven sempre procura pelo POM para executar

### Pom.xml básico
```
<project>
  <modelVersion>4.0.0</modelVersion>
  <groupId>web.digitalinnovationone</groupId>
  <artifactId>webapp-project</artifactId>
  <version>1.0-SNAPSHOT</version>
</project>
```

### O Super POM
* Modelo base nas quais tem todas as configurações padrões.
* Caso você não declare, o Maven busca do Super (conceito de herança)
* Você pode sobrescrever

## Download e instalação Maven
1. maven.apache.org > Binary zip archive apache-maven-3.8.6-bin.zip
2. Movi para ProgramFIles (onde tá o Java, mas é opcional) >
3. Variáveis de ambiente > Path > add o caminho ate \bin
4. Testa com mvn –version

## Criação do primeiro projeto
```
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
```

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

## Repositórios
* Local (userprofile\.m2\repository) e Remoto (Maven Center)
* Podemos encontrar plugins e bibliotecas

## Propriedades
* groupID: id da organização
* artifactId: nome do projeto em si
* version: número da versão que será utilizada

## Dependência direta (declarada no pom.xml) e transitiva (dependências obrigatórias das dependências declaradas no pom.xml)

## Publicar dependências:
mvn install (vai pro repositório local)

## Reutilizar componentes:
copia grupId, artifactId e version e cola na dependência do outro projeto

## Ciclo de vida de construção
1. Default Lifecycle:
  * Principal ciclo
  * Deploy local
  * 23 fases (comandos): validate, compile, test, package, install, deploy
2. Clean Lifecycle:
  * Limpeza do projeto, preparado para  publicação
  * 3 fases (pre-clean, clean, post-clean)
3. Site Lifecycle:
  * 4 fases (pre-site, site, post-site, site-deploy)
  * Documentação

## Projetos multi-módulos
* No projeto "pai", que agrega aos demais, inclui 
``` 
<packaging>pom</packaging>
```
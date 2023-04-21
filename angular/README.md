### 🔗 Pré-requisitos
* HTML e CSS
* JavaScript/TypesCript
* Node


### ⌨️ Comandos básicos
```
npm install //gera arquivos package.json e package-lock.json
npx tsc --init //gera arquivo tsconfig 
npx tsc //compila e executa
```


### ⚙️ Configurações
* Alterar pastas de root para src (ts) e outdir para build (js) 
* Preferível criar um script e executar `npm run <nome do script>`


### 📝 Aprendizado:
>Array Multi Type: `let a1: (string | number)[] = ["a", 1, 7]`

<br>

>Tupla: `let a2: [number, string, number] = [1, "a", 7] //segue a ordem declarada`<br>

<br>

>Camadas:
<ol>
<li>Componentes:
    <ul>
    <li>Elemento visual, customizável e replicável;<br>
    <li>Átomo da aplicação: com as mesmas "peças" pode gerar várias figuras; 
    <li>Função js/ts que retorna html, css e carrega eventos js.
    </ul>
</li>
<p>Obs.: componentes lógicos não têm html e não são visuais porém customizáveis e replicáveis
<li>Gerenciamento de estado: comunicação síncrona entre componentes</li>
<li>Roteamento: a partir da url das páginas mostra determinados componentes</li>
<li>Renderização: "entrega o desenho" para o navegador</li>
</ol><br>

>Como a aplicação é montada? 
* Através de injeção de dependências. Seu "corpo" naturalmente não produz, mas você depende dele para a solução de um problema. 

    Ex.: Componentes (banner component, card component, video component) injetados num componente principal (app-root - componente lógico que só carrega um comportamento) que por sua vez é injetado no index.html, html final onde haverá renderização.

<br>

>Entendendo a estrutura básica de um projeto Angular

* src in - parte codável:
    *index.html: vai ser renderizado (root = coração)
    * main: configurações da inicialização
    * podyfilis: aumentar compatibilidade, fazer funções específicas para navegadores antigos
    * style.css: estilo global
    * app:
        * html próprio
        * seletor: tag que você usa pra chamar o componente
        * o ts junta seletor, template (html) e css, porém pode ser feito tudo junto
        * importar do @angular/core
        * app.module agrupa importações
* src out: arquivos de configuração
</p>
<br>

>Estrutura básica de um componente
* porta de entrada: arquivo ts
* caso de construção de html e css dentro do ts:
```
import { Component, Input } from '@angular/core'; //importa do módulo principal uma interface

@Component({ //decorator 
  selector: 'hello', //tag que vou utilizar
  standalone: true, //configuração opcional que estava no stackblitz, executa o compilado sem precisar de servidor web
  template: `<h1>Hello from {{name}}!</h1>`, //html
  styles: [`h1 {color: green;}`], //css
})

export class HelloComponent { //exportação de classe
  @Input() name: string;
}
```
* caso de html e css em arquivos separados:
```
  templateUrl: './hello.component.html', //o que muda é apenas a "propriedade"
  styleUrls: ['./hello.component.css'],
```

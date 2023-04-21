>Pré-requisitos
* HTML e CSS
* JavaScript/TypesCript
* Node

<br>

>Comandos básicos
```
npm install //gera arquivos package.json e package-lock.json
npx tsc --init //gera arquivo tsconfig 
npx tsc //compila e executa
```
<br>

>Configurações
* Alterar pastas de root para src (ts) e outdir para build (js) 
* Preferível criar um script e executar 
<br>`npm run <nome do script>`

<br>

>Aprendizado:
* Array Multi Type
<br>
`let a1: (string | number)[] = ["a", 1, 7]`
* Tupla
<br>
 `let a2: [number, string, number] = [1, "a", 7] //segue a ordem declarada`<br>

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

>Entendendo a estrutura básica de um projeto Angular

    src - parte codável:
        index.html: vai ser renderizado (root = coração)
        main: configurações da inicialização
        podyfilis: aumentar compatibilidade, fazer funções específicas para navegadores antigos
        style.css: estilo global

        app:
            html próprio
            seletor: tag que você usa pra chamar o componente
            o ts junta seletor, template (html) e css, porém pode ser feito tudo junto
            importar do @angular/core
            app.module agrupa importações

    o resto são de configuração


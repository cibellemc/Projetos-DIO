class Cardnews extends HTMLElement { //herda características de um elemento
    constructor(){
        super()

        const shadow = this.attachShadow({mode: "open"}) //pode ser influenciado pelo html externo
        shadow.innerHTML = "<h1>hello</h1>"
    }
}

// nome da sua tag - precisa de hifen
customElements.define("card-news", Cardnews)
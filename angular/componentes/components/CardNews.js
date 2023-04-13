class Cardnews extends HTMLElement { //herda características de um elemento
    constructor(){
        super()

        const shadow = this.attachShadow({mode: "open"}) //pode ser influenciado pelo html externo
        shadow.appendChild(this.build())
        shadow.appendChild(this.styles())
    }

    build(){
        const componentRoot = document.createElement("div")
        componentRoot.setAttribute("class", "card")

        const cardRight = document.createElement("div")
        cardRight.setAttribute("class", "card-right")

        const img = document.createElement("img")
        cardRight.appendChild(img)

        const cardLeft = document.createElement("div")
        cardLeft.setAttribute("class", "card-left")

        const span = document.createElement("span")
        const a = document.createElement("a")
        const p = document.createElement("p")

        cardLeft.appendChild(span)
        cardLeft.appendChild(a)
        cardLeft.appendChild(p)

        // "pendura no componente principal"
        componentRoot.appendChild(cardLeft)
        componentRoot.appendChild(cardRight)

        return componentRoot
    }

    styles(){

    }
}

// nome da sua tag - precisa de hifen
customElements.define("card-news", Cardnews)
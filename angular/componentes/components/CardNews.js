class Cardnews extends HTMLElement { 
    constructor(){
        //herda características de um elemento html
        super()

        // cria um shadow
        const shadow = this.attachShadow({mode: "open"}) //pode ser influenciado pelo html externo
        // link com os elementos construídos
        shadow.appendChild(this.build())
        // link com o css
        shadow.appendChild(this.styles())
    }

    build(){
        const componentRoot = document.createElement("div")
        componentRoot.setAttribute("class", "card")

        // poderia ter uma função para cada filho
        const cardRight = document.createElement("div")
        cardRight.setAttribute("class", "card-right")

        // set = atribui valor a um prop, get = pega o valor que foi passado
        const img = document.createElement("img")
        img.setAttribute("src", (this.getAttribute("photo") || "assets/image2-512.webp"))
        // img.src = "assets/1002903_1.png"
        img.alt = "Foto da notícia"
        cardRight.appendChild(img)


        // parte da notícia em si
        const cardLeft = document.createElement("div")
        cardLeft.setAttribute("class", "card-left")

        const author = document.createElement("span")
        // o texto do elemento é o conteúdo + o valor do atributo passado no html
        // no caso de não ser passado (null), usa o default
        author.textContent = "By " + (this.getAttribute("author") || "By Anonimous")

        const newsTitle = document.createElement("a")
        newsTitle.textContent = this.getAttribute("newsTitle")
        newsTitle.href = this.getAttribute("") // em vez de setar pode acessar direto

        const description = document.createElement("p")
        description.textContent = this.getAttribute("description")

        cardLeft.appendChild(author)
        cardLeft.appendChild(newsTitle)
        cardLeft.appendChild(description)

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
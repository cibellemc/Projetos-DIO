
const pokeapi = {}

pokeapi.getPokemonDetail = (pokemon) => {
    return fetch(pokemon.url).then((response) => response.json())
}

pokeapi.getPokemons = (offset = 0, limit = 10) => {
    const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`

    // fetch retorna um promise - processamento assíncron: resposta não é imediata, se der certo uma hora você recebe
    return fetch(url) // requisição pra url
        .then((response) =>  response.json()) // quando recurso for disponibilizado, converte pra json retorna uma promise dessa conversão
        .then((json) => json.results) //segundo then recebe o resultado do primeiro - pega os resultados (array que nos interessa)
        .then((pokemons) => pokemons.map(pokeapi.getPokemonDetail)) // pra cada pokemon da lista faz uma requisição pro detalhe dele
        .then((detailRequests) => Promise.all(detailRequests))
        .then((pokemonsDetail) => pokemonsDetail)
}
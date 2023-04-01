
const offset = 0
const limit = 10
const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`

function convertPokemonToList(pokemon){
    return `
    <li class="pokemon">
    <span class="number">#001</span>
    <span class="name">${pokemon.name}</span>
    
    <div class="detail">
        <ol class="types">
            <li class="type">grass</li>
            <li class="type">poison</li>
        </ol>

        <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg" alt="${pokemon.name}">
    </div>   
</li>
`
}

const pokemonsList = document.getElementById('pokemonsList')

// fetch retorna um promise - processamento assíncron: resposta não é imediata, se der certo uma hora você recebe
fetch(url)
    .then((response) =>  response.json()) // quando recurso for disponibilizado, converte pra json retorna uma promise dessa conversão
    .then((json) => json.results) //segundo then recebe o resultado do primeiro - pega os resultados (array que nos interessa)
    .then((pokemons) => { // pega cada pokemon dentro da lista e acrescenta ao html
        for (let i = 0; i < pokemons.length; i++) {
            const pokemon = pokemons[i];
            pokemonsList.innerHTML += convertPokemonToList(pokemon)
        }
    })
    .catch((error) => console.error(error)) //quando dá erro
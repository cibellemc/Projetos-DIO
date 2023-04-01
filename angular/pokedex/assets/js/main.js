
function convertPokemonTypeToLi(pokemonTypes) {
    // o dicionário é types:[{"slot": 1,"type": {"name": "grass","url": "https://pokeapi.co/api/v2/type/12/"},{"slot": 2,"type": {"name": "poison", "url": "https://pokeapi.co/api/v2/type/4/"}}]

    return pokemonTypes.map((typeSlot) => `<li class="type">${typeSlot.type.name}</li>`)
}

function convertPokemonToList(pokemon){
    return `
    <li class="pokemon">
    <span class="number">#${pokemon.id}</span>
    <span class="name">${pokemon.name}</span>
    
    <div class="detail">
        <ol class="types">
            ${convertPokemonTypeToLi(pokemon.types).join('')}
        </ol>

        <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg" alt="${pokemon.name}">
    </div>   
</li>
`
}

const pokemonsList = document.getElementById('pokemonsList')

// busca a lista de pokemons e transforma poke em lista string de html e concatena lista sem separador, formando um novo html
pokeapi.getPokemons().then((pokemons = []) => { 
    // em vez de usar for, estimula a página a renderizar re uma vez
    pokemonsList.innerHTML += pokemons.map(convertPokemonToList).join('')
})
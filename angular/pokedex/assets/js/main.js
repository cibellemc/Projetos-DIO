

function convertPokemonToList(pokemon){
    return `
    <li class="pokemon">
    <span class="number">#${pokemon.id}</span>
    <span class="name">${pokemon.name}</span>
    
    <div class="detail">
        <ol class="types">
            ${pokemon.types.map((type) => `<li class="type">${type}</li>`).join('')}
        </ol>

        <img src="${pokemon.photo}" alt="${pokemon.name}">
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
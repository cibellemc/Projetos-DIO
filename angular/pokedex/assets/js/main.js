
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

pokeapi.getPokemons().then((pokemons = []) => { 
    // em vez de usar for, estimula a página a renderizar re uma vez
    pokemonsList.innerHTML += pokemons.map(convertPokemonToList).join('')
})
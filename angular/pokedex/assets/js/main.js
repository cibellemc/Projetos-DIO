
const pokemonsList = document.getElementById('pokemonsList')
const loadMoreButton = document.getElementById('loadMore')
let pokemons = document.getElementsByClassName('pokemon')

const maxCards = 151 // máximo de exibições - primeira geração
const limit = 5 // quantidade de cards por página - número fixo
let offset = 0 // cada offset aumenta em 5 (o limit), é a quantidade de pokes

function convertPokemonToList(pokemon){
    // ter o tipo no nome da classe vai permitir estilizar css
    return `
    <li class="pokemon ${pokemon.type}">
    <span class="number">#${pokemon.id}</span>
    <span class="name">${pokemon.name}</span>

    
    <div class="detail">
        <ol class="types">
            ${pokemon.types.map((type) => `<li class="type ${type}">${type}</li>`).join('')}
        </ol>
        <ol class="habilitys">
            ${pokemon.habilitys.map((hability) => `<li class="hability ${hability}">${hability}</li>`).join('')}
        </ol>

        <img src="${pokemon.photo}" alt="${pokemon.name}">
    </div>   
    </li>
`
}

function loadPokemons(offset, limit){
    // busca a lista de pokemons e transforma poke em lista string de html e concatena lista sem separador, formando um novo html
    pokeapi.getPokemons(offset, limit).then((pokemons = []) => { 
        // em vez de usar for, estimula a página a renderizar de uma vez
        pokemonsList.innerHTML += pokemons.map(convertPokemonToList).join('')

        let novosPokemons = document.querySelectorAll('.pokemon')
        for (let i = pokemons.length - novosPokemons.length; i < pokemons.length; i++) {
            let modal = document.createElement("div");
            modal.className = "modal";

            const name = pokemons[i].name;
            const photo = pokemons[i].photo;
            const habilitys = pokemons[i].habilitys;

            let habilitysList = '';
            for (let i = 0; i < habilitys.length; i++) {
                habilitysList += `<li class="hability">${habilitys[i]}</li>`;
            }

            modal.innerHTML = `<button class="fechar-modal">x</button>
            <img src="${photo}">
            <h2>${name}</h2>
            <ul class="habilitys">
                ${habilitysList}
            </ul>
            `;

            document.body.appendChild(modal);

            novosPokemons[i - (pokemons.length - novosPokemons.length)].addEventListener("click", function() {
                let modal = document.getElementsByClassName("modal")[i];
                modal.style.display = "block";

                modal.getElementsByClassName("fechar-modal")[0].addEventListener("click", function() {
                    modal.style.display = "none";
                });
            });
        }
    });
}

loadPokemons(offset, limit)

loadMoreButton.addEventListener('click', () => {
    offset += limit  // cada vez que o botão é clicado aumenta 5 cads
    const qtdCardsNextPage = offset + limit // calcula a quantidade de cards no próximo click
    
    if (qtdCardsNextPage >= maxCards) { // se passar da quantidade máxima definida (151)
        const newLimit = maxCards - offset // diferença entre o máximo e o que seria exibido
        loadPokemons(offset, newLimit)

        loadMoreButton.parentElement.removeChild(loadMoreButton)
    } else {
        loadPokemons(offset, limit)
    }
    pokemons = document.getElementsByClassName('pokemon')
})


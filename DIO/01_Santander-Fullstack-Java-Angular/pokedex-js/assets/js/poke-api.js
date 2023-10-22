
const pokeApi = {}

function convertePokeApiDetailToPokemon(pokeDetail) {
    const pokemon = new Pokemon()
    pokemon.order = String(pokeDetail.id).padStart(3, '0')
    pokemon.name = pokeDetail.name

    const types = pokeDetail.types.map((typeSloat) => typeSloat.type.name)
    const [type] = types

    pokemon.types = types
    pokemon.type = type

    pokemon.photo = pokeDetail.sprites.other.dream_world.front_default
    //pokemon.photo = pokeDetail.sprites.versions["generation-v"]["black-white"].animated.front_default
    //pokemon.photo = pokeDetail.sprites.other["official-artwork"].front_default

    return pokemon
}

pokeApi.getPokemonsDetail = (pokemon) => {
    return fetch(pokemon.url)
            .then((response) => response.json())
            .then(convertePokeApiDetailToPokemon)
}

pokeApi.getPokemons = (offset = 0, limit = 5) =>  {
    const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`

    return fetch(url)
        .then((response) => response.json())
        .then((jsonBody) => jsonBody.results)
        .then((pokemons) => pokemons.map(pokeApi.getPokemonsDetail))
        .then((detailRequest) => Promise.all(detailRequest))
        .then((pokemonsDetails) => (pokemonsDetails))
}

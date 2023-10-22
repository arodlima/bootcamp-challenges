
let escolhaDoTreinador = parseInt(gets());

//TODO: Implemente as condições necessárias para a solução do desafio. Utilize a tabela de exemplos para identificar a escolha do treinador:
const pokemons = {
    1: "Bulbasaur",
    2: "Charmander",
    4: "Pikachu",
};
let pokemonEscolhido = pokemons[escolhaDoTreinador] || "Mewtwo";

print(`Voce escolheu o ${pokemonEscolhido} como seu Pokemon inicial.`);
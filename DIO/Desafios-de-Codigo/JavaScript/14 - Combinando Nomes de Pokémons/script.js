// TODO: Defina uma função chamada "combinandoNomesPokemons" que recebe um parâmetro chamado (palavra);
// TODO: Dentro da função, crie uma variável chamada "palavraPokemon" que é formada pela concatenação da "palavra" com a string "saur";  
// TODO: Após a váriavel, retorne a palavra pokemon; 
function combinandoNomesPokemons(palavra) {
    return palavra + "saur";
}

// Entrada da palavra usando gets():
var nomeEntrada = gets();

// Chamando a função e exibindo a palavra gerada:
print(combinandoNomesPokemons(nomeEntrada));
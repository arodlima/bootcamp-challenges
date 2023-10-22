// Lê a jogada do personagem:
var jogadaPersonagem = parseInt(gets());

// Lê a jogada do monstro:
var jogadaMonstro = parseInt(gets());

// TODO: Crie uma função ou outro conceito de lógica de programação para realizar o combate e retornar o resultado:
var resultado = "Foi um empate!";

if (jogadaPersonagem > jogadaMonstro) {
    resultado = "Você venceu a batalha!";
} else if (jogadaPersonagem < jogadaMonstro) {
    resultado = "Você perdeu a batalha!";
}

// TODO: imprimir o resultado:
print(resultado);
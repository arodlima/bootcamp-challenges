// Solicita ao usuário que insira o nome do personagem:
const nomePersonagem = gets();

// Solicita ao usuário que escolha entre "Atacar" ou "Fugir":
const acaoEscolhida = gets();

// TODO: Implemente uma solução utilizando lógica de programação;
//TODO: Verifique a ação escolhida e exibir a mensagem correspondente:
let mensagem;

if (acaoEscolhida === "Fugir" || acaoEscolhida === "Atacar") {
    mensagem = `${nomePersonagem} escolheu ${acaoEscolhida}!`;
} else {
    mensagem = "Tente novamente";
}

print(mensagem);
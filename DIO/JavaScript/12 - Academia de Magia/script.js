// Solicita ao usuário o tipo de magia
const tipoMagia = gets();

// Solicita ao usuário a quantidade de vezes que a magia será usada
const quantidade = parseInt(gets());

//TODO: Crie uma função ou outra estrutura condicional para retornar a mensagem correspondente ao tipo de magia:
let mensagem;

switch (tipoMagia) {
    case "ataque":
        mensagem = "Usou magia de ataque!";
        break;
    case "cura":
        mensagem = "Usou magia de cura!";
        break;
    case "defesa":
        mensagem = "Usou magia de defesa!";
        break;
    default:
        mensagem = "Tipo de magia inválido!";
}

// É impresso a mensagem a quantidade de vezes especificada:
for (let i = 0; i < quantidade; i++) {
    print(mensagem);
}
//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const valor = parseFloat(gets());

//TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
//TODO: Imprimir a mensagem de valor inválido.
//TODO: Imprimir a mensagem de encerrar o programa.
const mensagem = valor > 0
  ? `Deposito realizado com sucesso!\n Saldo atual: R$ ${valor.toFixed(2)}`
  : valor < 0
    ? "Valor invalido! Digite um valor maior que zero."
    : "Encerrando o programa...";

print(mensagem);

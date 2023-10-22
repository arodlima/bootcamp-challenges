//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

// Entrada de dados
let saldoTotal = parseInt(gets());
let valorSaque = parseInt(gets());

//TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
const valorFinal = saldoTotal - valorSaque;

const mensagem = saldoTotal >= valorSaque 
    ? `Saque realizado com sucesso. Novo saldo: ${valorFinal}` 
    : "Saldo insuficiente. Saque nao realizado!";

print(mensagem);

//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const valorInicial = parseFloat(gets());
const taxaJuros = parseFloat(gets());
const periodo = parseInt(gets());

//TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
let valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
print(`Valor final do investimento: R$ ${valorFinal.toFixed(2)}`);

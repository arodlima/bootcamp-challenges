// Entrada de dados.
const totalSalas = parseInt(gets());

//Aqui temos uma demonstração de array com valores já predefinidos:
const salasComTesouro = [2, 4, 7];
const salasComMonstro = [3, 6, 8];

//Aqui temos uma forma de loop para percorrer cada sala da masmorra:
//TODO: Agora implemente uma condição necessária para verificar e exibir se há tesouro na sala e se há montro na sala:
for (let sala = 1; sala <= totalSalas; sala++) {
    if (salasComTesouro.includes(sala)) {
    print(`Tesouro na sala ${sala}!`);
} else if (salasComMonstro.includes(sala)) {
    print(`Monstro na sala ${sala}!`);
}
}
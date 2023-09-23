const result = (victories, defeats) => victories - defeats;

const victoriesResult = result(1000, 50)

const ranking = () => {
    let level

    if (victoriesResult <= 10) {
        level = "Ferro";
    } else if (victoriesResult <= 20) {
        level = "Bronze";
    } else if (victoriesResult <= 50) {
        level = "Prata";
    } else if (victoriesResult <= 80) {
        level = "Ouro";
    } else if (victoriesResult <= 90) {
        level = "Diamante";
    } else if (victoriesResult <= 100) {
        level = "Lendário";
    } else {
        level = "Imortal";
    }
    return level
}

const level = ranking(victoriesResult)

console.log(`O Herói de saldo ${victoriesResult} está no nível ${level}`)

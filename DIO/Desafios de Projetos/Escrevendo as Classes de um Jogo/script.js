class hero {
    constructor(name, age, type) {
        this.name = name
        this.age = age
        this.type = type
    }

    attack() {
        let attack

        switch(this.type) {
            case 'mago':
                attack = 'magia'
                break
            case 'guerreiro':
                attack = 'espada'
                break
            case 'monge':
                attack = 'artes marciais'
                break
            case 'ninja':
                attack = 'shuriken'
                break
            default:
                attack = 'um ataque desconhecido'
        }

        console.log(`O ${this.type} atacou usando ${attack}`)
    }
}

const myHero = new hero("Erick", 100, "guerreiro")
myHero.attack()
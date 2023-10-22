# POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

---

# Diagramação

<!--
![iPhone-UML](https://github.com/arodlima/challenges/assets/104288946/60eaa2b4-4614-4f17-8e0b-5cd61770f44a)
-->

```mermaid
---
title: iPhone
---
classDiagram
    class Main {
        + main(String[] args)
    }
    class Aparelho {
        + ligar()
        + atender()
        + iniciarCorreioVoz()
        + exibirPagina()
        + adicionarNovaAba()
        + atualizarPagina()
        + tocar()
        + pausar()
        + selecionarMusica()
    }
    class Reprodutor {
	      <<interface>>
        + tocar(): void
        + pausar(): void
        + selecionarMusica(): void
    }
    class Telefone {
	      <<interface>>
        + ligar(): void
        + atender(): void
        + iniciarCorreioVoz(): void
    }
    class Navegador {
	      <<interface>>
        + exibirPagina(): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }

    Main --> Aparelho : cria uma instância
    Aparelho --|> Telefone : implementa
    Aparelho --|> Navegador : implementa
    Aparelho --|> Reprodutor : implementa
```

```mermaid
---
title: Diagrama de Sequência para a interação
---
sequenceDiagram
    participant Main as Main
    participant iPhone as Aparelho

    Main->>iPhone: Aparelho iPhone = new Aparelho()
    Note over Main,iPhone: APARELHO TELÊFONICO:
    Main->>iPhone: iPhone.ligar()
    iPhone-->>Main: "Ligando..."
    Main->>iPhone: iPhone.atender()
    iPhone-->>Main: "Atendendo ligação"
    Main->>iPhone: iPhone.iniciarCorreioVoz()
    iPhone-->>Main: "Ligação encaminhada para o Correio de Voz"
    Note over Main,iPhone: NAVEGADOR NA INTERNET:
    Main->>iPhone: iPhone.exibirPagina()
    iPhone-->>Main: "Exibindo uma página no navegador"
    Main->>iPhone: iPhone.adicionarNovaAba()
    iPhone-->>Main: "Nova aba adicionada no navegador"
    Main->>iPhone: iPhone.atualizarPagina()
    iPhone-->>Main: "Atualizando página do navegador"
    Note over Main,iPhone: REPRODUTOR MUSICAL:
    Main->>iPhone: iPhone.tocar()
    iPhone-->>Main: "Música tocando..."
    Main->>iPhone: iPhone.pausar()
    iPhone-->>Main: "Música pausada."
    Main->>iPhone: iPhone.selecionarMusica()
    iPhone-->>Main: "Selecionando uma nova música"
```

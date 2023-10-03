package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio016 {
    public static void main(String[] args) {
        //agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(num -> num % 2 != 0).toList();

        System.out.println("Os números pares: " + numerosPares);
        System.out.println("Os números ímpares: " + numerosImpares);
    }
}

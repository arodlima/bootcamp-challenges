package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio001 {
    public static void main(String[] args) {
        //ordenar a lista de números em ordem crescente e a exiba no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmOrdemCrescente = numeros.stream()
                .sorted()
                .toList();

        numerosEmOrdemCrescente.forEach(System.out::println);
    }
}

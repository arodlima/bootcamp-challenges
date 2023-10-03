package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio013 {
    public static void main(String[] args) {
        //filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(num -> num >= 5 && num <= 10)
                .distinct()
                .toList();

        System.out.println("O números no intervalo entre 5 e 10: " + numerosNoIntervalo);
    }
}

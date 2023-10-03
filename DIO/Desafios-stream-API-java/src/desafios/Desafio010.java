package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio010 {
    public static void main(String[] args) {
        //para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> grupos = numeros.stream()
                .filter(num -> num % 2 != 0 && (num % 3 == 0 || num % 5 == 0))
                .collect(Collectors.partitioningBy(num -> true));

        List<Integer> numerosMultiplos = grupos.get(true);

        System.out.println("Números ímpares múltiplos de 3 ou 5: " + numerosMultiplos);
    }
}

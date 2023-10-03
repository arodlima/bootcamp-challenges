package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio009 {
    public static void main(String[] args) {
        //verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosRepetidos = numeros.stream()
                .collect(Collectors.groupingBy(Integer::intValue))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Os números que não são distintos: " + numerosRepetidos);
    }
}

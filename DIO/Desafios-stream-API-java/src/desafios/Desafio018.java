package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio018 {
    public static void main(String[] args) {
        //verifique se todos os números da lista são iguais e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Integer, List<Integer>> contagem = numeros.stream()
                .collect(Collectors.groupingBy(num -> num));

        List<Integer> numerosRepetidos = contagem.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(numerosRepetidos);
    }
}

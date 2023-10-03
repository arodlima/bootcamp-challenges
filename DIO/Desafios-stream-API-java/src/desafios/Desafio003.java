package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio003 {
    public static void main(String[] args) {
        //verifique se todos os números da lista são positivos e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, -4, -3);

        List<Integer> numerosPositivos = numeros.stream()
                .filter(num -> num > 0)
                .toList();

        System.out.println(numerosPositivos);
    }
}

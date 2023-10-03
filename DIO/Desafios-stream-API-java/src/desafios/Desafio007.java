package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio007 {
    public static void main(String[] args) {
        //encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .distinct()
                .toList();

        int segundoMaior = numerosOrdenados.get(numerosOrdenados.size() - 2);

        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}

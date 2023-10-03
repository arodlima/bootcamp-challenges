package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio004 {
    public static void main(String[] args) {
        //remover os valores ímpares da lista e imprima a lista resultante no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("Somente os números pares: " + numerosPares);
    }
}

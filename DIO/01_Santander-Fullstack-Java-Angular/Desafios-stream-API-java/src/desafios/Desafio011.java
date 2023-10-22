package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio011 {
    public static void main(String[] args) {
        //encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                .mapToInt(num -> num * num)
                .sum();

        System.out.println("Soma dos quadrados de todos os números: " + somaDosQuadrados);
    }
}

package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio002 {
    public static void main(String[] args) {
        //realize a soma dos números pares da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números pares é: " + resultado);
    }
}

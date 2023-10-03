package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio019 {
    public static void main(String[] args) {
        //encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);
    }
}

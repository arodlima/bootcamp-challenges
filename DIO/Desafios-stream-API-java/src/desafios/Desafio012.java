package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio012 {
    public static void main(String[] args) {
        //encontre o produto de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDosNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Produto de todos os números: " + produtoDosNumeros);
    }
}

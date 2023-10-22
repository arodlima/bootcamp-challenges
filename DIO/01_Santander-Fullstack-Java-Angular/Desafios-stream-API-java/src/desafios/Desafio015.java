package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio015 {
    public static void main(String[] args) {
        //verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
                .filter(num -> num < 0)
                .toList();

        if (!numerosNegativos.isEmpty()) {
            System.out.println("Números negativos na lista: " + numerosNegativos);
        } else {
            System.out.println("A lista não tem números negativos.");
        }
    }
}

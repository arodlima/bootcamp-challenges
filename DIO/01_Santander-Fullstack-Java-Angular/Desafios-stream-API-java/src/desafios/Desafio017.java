package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio017 {
    public static void main(String[] args) {
        //filtre os números primos da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                .filter(Desafio017::isPrimo)
                .distinct()
                .toList();

        System.out.println("Números primos na lista: " + primos);
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

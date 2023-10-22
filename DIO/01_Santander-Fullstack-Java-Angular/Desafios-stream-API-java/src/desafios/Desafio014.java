package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio014 {
    public static void main(String[] args) {
        //encontre o maior número primo da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio014::isPrimo)
                .distinct()
                .max(Integer::compareTo);

        if (!maiorPrimo.isEmpty()) {
            System.out.println("Maior número primo na lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Nenhum número primo na lista.");
        }
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

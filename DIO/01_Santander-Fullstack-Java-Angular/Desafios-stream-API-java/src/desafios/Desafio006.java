package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio006 {
    public static void main(String[] args) {
        //verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQueDez = numeros.stream()
                .filter(num -> num > 10)
                .toList();

        System.out.println("Os números na lista maiores que 10: " + maioresQueDez);
    }
}

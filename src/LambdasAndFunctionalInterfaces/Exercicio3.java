package LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        int[] soma = new int[1]; // usando array para permitir mutação

        numeros.forEach(n -> soma[0] += n);

        System.out.println("Soma: " + soma[0]); // Resultado: 10

        // int soma = 0;
        // numeros.forEach(n -> soma += n); // ❌ Erro: soma não é efetivamente final
    }
}


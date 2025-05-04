package LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");

        for (int i = 0; i < nomes.size(); i++) {
            final int indice = i; // necessário para capturar o valor dentro da lambda

            new Thread(() -> System.out.println("Nome: " + nomes.get(indice))).start();

            // new Thread(() -> System.out.println(nomes.get(i))).start(); // ❌ Erro: i não é efetivamente final
        }
    }
}


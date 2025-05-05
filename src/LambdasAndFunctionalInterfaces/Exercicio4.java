package LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream()
                .map(Exercicio4::dobrar)
                .forEach(System.out::println);
    }

    public static int dobrar(int n) {
        return n * 2;
    }
}


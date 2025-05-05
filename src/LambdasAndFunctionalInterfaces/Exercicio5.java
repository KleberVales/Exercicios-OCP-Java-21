package LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Exercicio5 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Carlos", "ana", "Bruno", "daniel");
        nomes.sort(String::compareToIgnoreCase);
        nomes.forEach(System.out::println);
    }
}

